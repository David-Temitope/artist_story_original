import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

old_active = """    } else {
        // WhatsApp Chat Room view
        val npcId = activeChatNpcId!!
        val npc = state.npcs.find { it.id == npcId } ?: return
        val conv = state.chatConversations.find { it.npcId == npcId }"""

new_active = """    } else {
        // WhatsApp Chat Room view
        val npcId = activeChatNpcId!!
        val npc = state.npcs.find { it.id == npcId }
        val ccMember = state.capitalClubMembers.find { it.id == npcId }
        val conv = state.chatConversations.find { it.npcId == npcId }
        
        val chatDisplayName = npc?.name ?: ccMember?.name ?: conv?.npcName ?: "Unknown" """

content = content.replace(old_active, new_active)

old_header = """            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF202C33))
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { activeChatNpcId = null }) {
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color(0xFFE9EDEF))
                }
                ArtistFaceAvatar(
                    artistIdentifier = npc.id,
                    modifier = Modifier.size(36.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f).clickable { showPsychologyDialogNpc = npc }) {
                    Text(text = npc.name, color = Color(0xFFE9EDEF), fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    Text(text = "online", color = Color(0xFFAEBAC1), fontSize = 11.sp)
                }
            }"""

new_header = """            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF202C33))
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { activeChatNpcId = null }) {
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color(0xFFE9EDEF))
                }
                
                if (ccMember != null && ccMember.imageUrl.isNotEmpty()) {
                    coil.compose.AsyncImage(
                        model = ccMember.imageUrl,
                        contentDescription = chatDisplayName,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(36.dp).clip(CircleShape)
                    )
                } else {
                    ArtistFaceAvatar(
                        artistIdentifier = npcId,
                        modifier = Modifier.size(36.dp)
                    )
                }
                
                Spacer(modifier = Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f).clickable { 
                    if (npc != null) showPsychologyDialogNpc = npc 
                }) {
                    Text(text = chatDisplayName, color = Color(0xFFE9EDEF), fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    Text(text = "online", color = Color(0xFFAEBAC1), fontSize = 11.sp)
                }
            }"""

content = content.replace(old_header, new_header)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
