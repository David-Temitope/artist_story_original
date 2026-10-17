with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r', encoding='utf-8', errors='ignore') as f:
    text = f.read()

target = 'fun createCastPost(content: String, category: String = "Music & Art") {'
replacement = 'fun createCastPost(content: String, category: String = "Music & Art", imageRes: String? = null) {'

target_post = '''            val newPost = CastPost(
                id = UUID.randomUUID().toString().take(6),
                authorName = state.artistName,
                authorHandle = "@${state.artistName.lowercase().replace(" ", "")}",
                content = content,
                likes = finalLikes,
                reposts = finalReposts,
                commentsCount = finalComments,
                week = state.currentWeek,
                year = state.currentYear,
                isByPlayer = true
            )'''

replacement_post = '''            val newPost = CastPost(
                id = UUID.randomUUID().toString().take(6),
                authorName = state.artistName,
                authorHandle = "@${state.artistName.lowercase().replace(" ", "")}",
                content = content,
                likes = finalLikes,
                reposts = finalReposts,
                commentsCount = finalComments,
                week = state.currentWeek,
                year = state.currentYear,
                isByPlayer = true,
                imageRes = imageRes
            )'''

if target in text and target_post in text:
    text = text.replace(target, replacement, 1)
    text = text.replace(target_post, replacement_post, 1)
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w', encoding='utf-8') as f:
        f.write(text)
    print('Successfully updated GameViewModel.kt!')
else:
    print('Failed to match target strings!')
