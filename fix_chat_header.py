import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

old_header = """                ArtistFaceAvatar(
                    artistIdentifier = npc.id,
                    modifier = Modifier.size(34.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = npc.name, color = Color(0xFFE9EDEF), fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    Text(text = npc.personality, color = Color(0xFF8696A0), fontSize = 10.sp)
                }
                IconButton(onClick = { showPsychologyDialogNpc = npc }) {"""

new_header = """                if (ccMember != null && ccMember.imageUrl.isNotEmpty()) {
                    coil.compose.AsyncImage(
                        model = ccMember.imageUrl,
                        contentDescription = chatDisplayName,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(34.dp).clip(CircleShape)
                    )
                } else {
                    ArtistFaceAvatar(
                        artistIdentifier = npcId,
                        modifier = Modifier.size(34.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = chatDisplayName, color = Color(0xFFE9EDEF), fontWeight = FontWeight.Bold, fontSize = 14.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
                    Text(text = npc?.personality ?: "Contact", color = Color(0xFF8696A0), fontSize = 10.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
                }
                IconButton(onClick = { if(npc != null) showPsychologyDialogNpc = npc }) {"""

content = content.replace(old_header, new_header)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
