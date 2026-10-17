import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

text = text.replace('"ventures" -> "Business Ventures"', '"ventures" -> "Business Ventures"\n                        "politics" -> "Voter Registration"')
text = text.replace('"ventures" -> com.example.ui.ventures.VenturesAppScreen(state, viewModel)', '"ventures" -> com.example.ui.ventures.VenturesAppScreen(state, viewModel)\n                "politics" -> PoliticsAppScreen(state, viewModel)')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

with open('app/src/main/java/com/example/ui/PoliticsAppScreen.kt', 'w') as f:
    f.write("""package com.example.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.HowToVote
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.data.GameStateEntity
import com.example.data.GameViewModel

@Composable
fun PoliticsAppScreen(state: GameStateEntity, viewModel: GameViewModel) {
    val isVotingWeek = state.isElectionSeason && (state.currentWeek == 14 || state.currentWeek == 38)
    
    val candidates = listOf(
        Pair("gov_sterling", "Governor Sterling" to "Current incumbent running for re-election. Promises tax cuts for businesses."),
        Pair("gov_challenger", "Mayor Reyes" to "Challenger. Promises increased arts funding and community programs."),
        Pair("sen_dawson", "Senator Dawson" to "Long-time senator. Strong on national defense and corporate subsidies."),
        Pair("sen_vance", "Candidate Vance" to "Progressive newcomer. Focuses on social equity and environmental policy.")
    ).filter { 
        if (state.currentWeek <= 14) it.first.startsWith("gov") 
        else it.first.startsWith("sen") 
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F172A))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.HowToVote,
            contentDescription = null,
            tint = Color(0xFF38BDF8),
            modifier = Modifier.size(48.dp).padding(top = 8.dp, bottom = 16.dp)
        )
        Text(
            text = "VOTER REGISTRATION & BALLOT",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
            letterSpacing = 1.sp
        )
        
        if (!state.isElectionSeason) {
            Spacer(modifier = Modifier.height(32.dp))
            Text("No active elections at this time.", color = Color.Gray, fontSize = 14.sp)
        } else {
            if (isVotingWeek) {
                Text(
                    text = "IT IS VOTING WEEK! You must cast your vote to proceed.",
                    color = Color(0xFFEF4444),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp, bottom = 16.dp),
                    textAlign = TextAlign.Center
                )
            } else {
                Text(
                    text = "Election season is underway. Candidates are campaigning.",
                    color = Color.Gray,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(top = 8.dp, bottom = 16.dp),
                    textAlign = TextAlign.Center
                )
            }

            LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp), modifier = Modifier.fillMaxWidth().weight(1f)) {
                items(candidates) { (id, info) ->
                    val (name, desc) = info
                    val isEndorsed = state.endorsedCandidateId == id
                    
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xFF1E293B)),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth().border(if (isEndorsed) 2.dp else 0.dp, if (isEndorsed) Color(0xFF38BDF8) else Color.Transparent, RoundedCornerShape(12.dp))
                    ) {
                        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                            // Unique Profile Picture (Unsplash)
                            AsyncImage(
                                model = "https://source.unsplash.com/random/200x200?politician,headshot&sig=${id.hashCode()}",
                                contentDescription = "Profile",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.size(64.dp).clip(CircleShape).border(2.dp, Color.White, CircleShape)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(name, color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                                Text(desc, color = Color.Gray, fontSize = 12.sp)
                                Spacer(modifier = Modifier.height(8.dp))
                                Button(
                                    onClick = {
                                        viewModel.updateState { it.copy(endorsedCandidateId = id) }
                                        viewModel.showToast("You have endorsed $name!")
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = if (isEndorsed) Color(0xFF10B981) else Color(0xFF3B82F6)),
                                    modifier = Modifier.fillMaxWidth().height(36.dp)
                                ) {
                                    Text(if (isEndorsed) "VOTED" else "VOTE / ENDORSE", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
""")

