package com.example.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: Models.kt */
@Metadata(mv = {2, 2, 0}, k = 2, xi = 48, d1 = {"��\u000e\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\u001a\u0012\u0010��\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"withPsychology", "Lcom/example/data/NPCEntity;", "random", "Lkotlin/random/Random;", "app"})
/* loaded from: ModelsKt.class */
public final class ModelsKt {
    @NotNull
    public static final NPCEntity withPsychology(@NotNull NPCEntity $this$withPsychology, @NotNull Random random) {
        List listOf;
        Intrinsics.checkNotNullParameter($this$withPsychology, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        String pers = $this$withPsychology.getPersonality();
        float pIntegrity = (random.nextFloat() * 40.0f) + 30.0f;
        float pGenerosity = (random.nextFloat() * 40.0f) + 30.0f;
        float pPride = (random.nextFloat() * 40.0f) + 30.0f;
        float pHumility = (random.nextFloat() * 40.0f) + 30.0f;
        float pLoyalty = (random.nextFloat() * 40.0f) + 30.0f;
        float pTrust = (random.nextFloat() * 40.0f) + 30.0f;
        float pJealousy = (random.nextFloat() * 30.0f) + 15.0f;
        float pGreed = (random.nextFloat() * 30.0f) + 20.0f;
        float pEgo = (random.nextFloat() * 40.0f) + 30.0f;
        float pPatience = (random.nextFloat() * 40.0f) + 30.0f;
        float pEmotionalIntel = (random.nextFloat() * 40.0f) + 30.0f;
        float pDiscipline = (random.nextFloat() * 40.0f) + 30.0f;
        float pCuriosity = (random.nextFloat() * 40.0f) + 30.0f;
        float pLeadership = (random.nextFloat() * 40.0f) + 30.0f;
        float pWisdom = (random.nextFloat() * 40.0f) + 30.0f;
        float pCompassion = (random.nextFloat() * 40.0f) + 30.0f;
        float pForgiveness = (random.nextFloat() * 40.0f) + 30.0f;
        float pGratitude = (random.nextFloat() * 40.0f) + 30.0f;
        float pCourage = (random.nextFloat() * 40.0f) + 30.0f;
        float pStressTolerance = (random.nextFloat() * 40.0f) + 30.0f;
        float pRiskTolerance = (random.nextFloat() * 40.0f) + 30.0f;
        float pWorkEthic = (random.nextFloat() * 40.0f) + 30.0f;
        float pAdaptability = (random.nextFloat() * 40.0f) + 30.0f;
        float pSelfAwareness = (random.nextFloat() * 40.0f) + 30.0f;
        String pStrength = "Highly Creative";
        String pWeakness = "Egoistic";
        String pCoreFear = "Obscurity";
        String pCoreDream = "Grammy Achievement";
        String pCommStyle = "Diplomatic";
        String pDecStyle = "Balanced";
        switch (pers.hashCode()) {
            case -1359833333:
                if (pers.equals("Hustler")) {
                    pGreed += 20.0f;
                    pDiscipline += 20.0f;
                    pRiskTolerance += 15.0f;
                    pWorkEthic += 25.0f;
                    pSelfAwareness += 10.0f;
                    pStrength = "Brilliant Business Mind";
                    pWeakness = "Materialistic";
                    pCoreFear = "Bankruptcy";
                    pCoreDream = "Financial Empire";
                    pCommStyle = (String) CollectionsKt.random(CollectionsKt.listOf(new String[]{"Direct", "Calm"}), random);
                    pDecStyle = "Analytical";
                    break;
                }
                break;
            case -635182331:
                if (pers.equals("Ambitious")) {
                    pHumility -= 15.0f;
                    pPride += 20.0f;
                    pJealousy += 20.0f;
                    pGreed += 20.0f;
                    pPatience -= 15.0f;
                    pEgo += 25.0f;
                    pDiscipline += 15.0f;
                    pStrength = "Laser Focused";
                    pWeakness = "Ruthless Drive";
                    pCoreFear = "Failure";
                    pCoreDream = "Billionaire Mogul";
                    pCommStyle = (String) CollectionsKt.random(CollectionsKt.listOf(new String[]{"Direct", "Aggressive"}), random);
                    pDecStyle = "Strategic";
                    break;
                }
                break;
            case 2130448:
                if (pers.equals("Diva")) {
                    pPride += 25.0f;
                    pEgo += 25.0f;
                    pHumility -= 20.0f;
                    pJealousy += 20.0f;
                    pStressTolerance -= 15.0f;
                    pEmotionalIntel += 10.0f;
                    pStrength = "Commanding Presence";
                    pWeakness = "Diva Demands";
                    pCoreFear = "Obscurity";
                    pCoreDream = "Superstardom";
                    pCommStyle = (String) CollectionsKt.random(CollectionsKt.listOf(new String[]{"Emotional", "Aggressive"}), random);
                    pDecStyle = "Emotional";
                    break;
                }
                break;
            case 78835030:
                if (pers.equals("Rebel")) {
                    pPride += 20.0f;
                    pIntegrity -= 10.0f;
                    pRiskTolerance += 25.0f;
                    pPatience -= 20.0f;
                    pCourage += 20.0f;
                    pStrength = "Uncompromising Authenticity";
                    pWeakness = "Self Destructive";
                    pCoreFear = "Conformity";
                    pCoreDream = "Cultural Revolution";
                    pCommStyle = (String) CollectionsKt.random(CollectionsKt.listOf(new String[]{"Aggressive", "Direct"}), random);
                    pDecStyle = "Impulsive";
                    break;
                }
                break;
            case 582893402:
                if (pers.equals("Charismatic")) {
                    pIntegrity += 20.0f;
                    pGenerosity += 20.0f;
                    pHumility += 15.0f;
                    pJealousy -= 15.0f;
                    pEmotionalIntel += 25.0f;
                    pLeadership += 20.0f;
                    pStrength = "Charming Personality";
                    pWeakness = "People Pleaser";
                    pCoreFear = "Public Rejection";
                    pCoreDream = "Beloved Global Icon";
                    pCommStyle = (String) CollectionsKt.random(CollectionsKt.listOf(new String[]{"Diplomatic", "Funny"}), random);
                    pDecStyle = "Balanced";
                    break;
                }
                break;
            case 1885066191:
                if (pers.equals("Creative")) {
                    pDiscipline -= 15.0f;
                    pCuriosity += 25.0f;
                    pAdaptability += 15.0f;
                    pStressTolerance -= 15.0f;
                    pWisdom += 10.0f;
                    pStrength = "Brilliant Artistry";
                    pWeakness = "Fragile Mental State";
                    pCoreFear = "Creative Burnout";
                    pCoreDream = "Time-tested Masterpiece";
                    pCommStyle = "Emotional";
                    pDecStyle = "Emotional";
                    break;
                }
                break;
        }
        if (Intrinsics.areEqual($this$withPsychology.getId(), "npc_family_mom")) {
            pIntegrity = 95.0f;
            pGenerosity = 98.0f;
            pHumility = 80.0f;
            pJealousy = 0.0f;
            pLoyalty = 100.0f;
            pCompassion = 95.0f;
            pForgiveness = 95.0f;
            pStrength = "Infinite Love";
            pWeakness = "Overprotective";
            pCoreFear = "Your Sadness";
            pCoreDream = "Your Ultimate Happiness";
            pCommStyle = "Diplomatic";
        } else if (Intrinsics.areEqual($this$withPsychology.getId(), "npc_gov_sterling")) {
            pIntegrity = 40.0f;
            pPride = 80.0f;
            pLeadership = 85.0f;
            pStrength = "Political Authority";
            pWeakness = "Bureaucratic Pride";
            pCoreFear = "Loss of Power";
            pCoreDream = "Electoral Dominance";
        } else if (Intrinsics.areEqual($this$withPsychology.getId(), "npc_sen_vance")) {
            pIntegrity = 30.0f;
            pGreed = 75.0f;
            pDiscipline = 85.0f;
            pStrength = "Strategic Alliance";
            pWeakness = "Transactional View";
            pCoreFear = "Scandal Humiliation";
            pCoreDream = "White House Presidency";
        }
        if (StringsKt.startsWith$default($this$withPsychology.getId(), "npc_family_", false, 2, (Object) null)) {
            listOf = CollectionsKt.listOf(new String[]{"Family Network", "Friend Network", "Hometown Network"});
        } else if (Intrinsics.areEqual($this$withPsychology.getId(), "npc_gov_sterling") || Intrinsics.areEqual($this$withPsychology.getId(), "npc_sen_vance")) {
            listOf = CollectionsKt.listOf(new String[]{"Government Network", "Business Network", "Media Network"});
        } else {
            List possible = CollectionsKt.mutableListOf(new String[]{"Music Industry Network"});
            if (Intrinsics.areEqual(pers, "Ambitious") || Intrinsics.areEqual(pers, "Hustler")) {
                possible.add("Business Network");
                possible.add("Investment Network");
            }
            if (Intrinsics.areEqual(pers, "Diva") || Intrinsics.areEqual(pers, "Charismatic")) {
                possible.add("Social Media Network");
                possible.add("Entertainment Network");
            }
            if (Intrinsics.areEqual(pers, "Creative") || Intrinsics.areEqual(pers, "Rebel")) {
                possible.add("Friend Network");
            }
            List otherPool = CollectionsKt.listOf(new String[]{"Church / Faith Community", "University Network", "Technology Network", "Film Industry", "Fashion Industry", "Sports Industry", "Luxury Brand Network", "International Network"});
            possible.add(CollectionsKt.random(otherPool, random));
            listOf = CollectionsKt.take(CollectionsKt.distinct(possible), 3);
        }
        List pNetworks = listOf;
        return NPCEntity.copy$default($this$withPsychology, null, null, 0.0f, 0.0f, 0L, false, 0.0d, null, 0.0f, 0L, 0, null, 0.0f, 0.0f, 0.0f, null, 0.0d, 0.0f, 0.0f, 0.0f, 0.0f, false, null, null, null, RangesKt.coerceIn(pIntegrity, 0.0f, 100.0f), RangesKt.coerceIn(pGenerosity, 0.0f, 100.0f), RangesKt.coerceIn(pPride, 0.0f, 100.0f), RangesKt.coerceIn(pHumility, 0.0f, 100.0f), RangesKt.coerceIn(pLoyalty, 0.0f, 100.0f), RangesKt.coerceIn(pTrust, 0.0f, 100.0f), RangesKt.coerceIn(pJealousy, 0.0f, 100.0f), RangesKt.coerceIn(pGreed, 0.0f, 100.0f), RangesKt.coerceIn(pEgo, 0.0f, 100.0f), RangesKt.coerceIn(pPatience, 0.0f, 100.0f), RangesKt.coerceIn(pEmotionalIntel, 0.0f, 100.0f), RangesKt.coerceIn(pDiscipline, 0.0f, 100.0f), RangesKt.coerceIn(pCuriosity, 0.0f, 100.0f), RangesKt.coerceIn(pLeadership, 0.0f, 100.0f), RangesKt.coerceIn(pWisdom, 0.0f, 100.0f), RangesKt.coerceIn(pCompassion, 0.0f, 100.0f), RangesKt.coerceIn(pForgiveness, 0.0f, 100.0f), RangesKt.coerceIn(pGratitude, 0.0f, 100.0f), RangesKt.coerceIn(pCourage, 0.0f, 100.0f), RangesKt.coerceIn(pStressTolerance, 0.0f, 100.0f), RangesKt.coerceIn(pRiskTolerance, 0.0f, 100.0f), RangesKt.coerceIn(pWorkEthic, 0.0f, 100.0f), RangesKt.coerceIn(pAdaptability, 0.0f, 100.0f), RangesKt.coerceIn(pSelfAwareness, 0.0f, 100.0f), pStrength, pWeakness, pCoreFear, pCoreDream, null, pCommStyle, pDecStyle, null, RangesKt.coerceIn((random.nextFloat() * 30.0f) + 40.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 40.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 40.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 40.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 40.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 40.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 40.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 40.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 45.0f, 0.0f, 100.0f), RangesKt.coerceIn((random.nextFloat() * 30.0f) + 45.0f, 0.0f, 100.0f), $this$withPsychology.getPopularity(), pNetworks, null, null, false, 33554431, 18874368, 224, null);
    }
}
