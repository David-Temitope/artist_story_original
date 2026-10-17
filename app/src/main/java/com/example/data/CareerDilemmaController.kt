package com.example.data

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.random.Random

object CareerDilemmaController {
    private val _activeDilemma = MutableStateFlow<CareerDilemma?>(null)
    val activeDilemma: StateFlow<CareerDilemma?> = _activeDilemma.asStateFlow()

    fun triggerDilemma(state: GameStateEntity, customDilemma: CareerDilemma? = null) {
        _activeDilemma.value = customDilemma ?: CareerDilemmaGenerator.generateDilemmaForState(state)
    }

    fun maybeTriggerRandomDilemma(state: GameStateEntity) {
        // ~35% chance of triggering an authentic industry dilemma upon weekly advance
        if (Random.nextFloat() < 0.35f) {
            triggerDilemma(state)
        }
    }

    fun dismissDilemma() {
        _activeDilemma.value = null
    }

    fun resolveDilemma(choice: DilemmaChoice, viewModel: GameViewModel) {
        val currentDilemma = _activeDilemma.value

        viewModel.updateState { s ->
            val updatedCash = s.cash + choice.cashDelta
            val updatedFans = (s.fans + choice.fansDelta).coerceAtLeast(0L)
            val updatedRep = (s.businessReputation + choice.reputationDelta).coerceIn(0f, 100f)
            val updatedStress = (s.stress + choice.stressDelta).coerceIn(0f, 100f)
            val updatedEnergy = (s.energy + choice.energyDelta).coerceIn(0, 100)

            val logEntry = "Year ${s.currentYear}, Week ${s.currentWeek}: [${currentDilemma?.category ?: "DECISION"}] Choice: \"${choice.actionText}\" -> ${choice.outcomeNarrative}"
            val newTimeline = s.timelineEvents + logEntry

            s.copy(
                cash = updatedCash,
                fans = updatedFans,
                businessReputation = updatedRep,
                stress = updatedStress,
                energy = updatedEnergy,
                timelineEvents = newTimeline
            )
        }

        // Post action feedback toast & stat deltas
        val feedbackDeltas = mutableListOf<StatFeedbackItem>()
        if (choice.cashDelta != 0.0) {
            feedbackDeltas.add(
                StatFeedbackItem(
                    label = "Cash",
                    deltaText = if (choice.cashDelta > 0) "+$${String.format("%,.0f", choice.cashDelta)}" else "-$${String.format("%,.0f", -choice.cashDelta)}",
                    isPositive = choice.cashDelta > 0
                )
            )
        }
        if (choice.fansDelta != 0L) {
            feedbackDeltas.add(
                StatFeedbackItem(
                    label = "Fans",
                    deltaText = if (choice.fansDelta > 0) "+${String.format("%,d", choice.fansDelta)}" else "${String.format("%,d", choice.fansDelta)}",
                    isPositive = choice.fansDelta > 0
                )
            )
        }
        if (choice.reputationDelta != 0f) {
            feedbackDeltas.add(
                StatFeedbackItem(
                    label = "Reputation",
                    deltaText = if (choice.reputationDelta > 0) "+${choice.reputationDelta.toInt()}%" else "${choice.reputationDelta.toInt()}%",
                    isPositive = choice.reputationDelta > 0
                )
            )
        }
        if (choice.stressDelta != 0f) {
            feedbackDeltas.add(
                StatFeedbackItem(
                    label = "Stress",
                    deltaText = if (choice.stressDelta > 0) "+${choice.stressDelta.toInt()}%" else "${choice.stressDelta.toInt()}%",
                    isPositive = choice.stressDelta <= 0
                )
            )
        }

        viewModel.postActionFeedback(
            title = choice.shortTitle,
            subtitle = choice.outcomeNarrative,
            deltas = feedbackDeltas,
            iconType = "star"
        )

        _activeDilemma.value = null
    }
}
