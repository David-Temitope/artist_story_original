import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    code = f.read()

# 1. replace appId
code = code.replace('appId = "news"', 'appId = "capital_club"')

# 2. replace AppConfig
code = code.replace(
    'AppConfig("news", "PulseWire", Icons.Default.Newspaper, Color(0xFFFF5252), breakingNewsCount),',
    'AppConfig("capital_club", "Capital Club", Icons.Default.Favorite, Color(0xFFFFD700), 0),'
)

# 3. replace top bar title
code = code.replace(
    '"news" -> "PulseWire News"',
    '"capital_club" -> "Capital Club"'
)

# 4. replace navigation route
code = code.replace(
    '"news" -> PulseWireNewsScreen(state, viewModel)',
    '"capital_club" -> com.example.ui.social.CapitalClubScreen(state, viewModel)'
)

# 5. remove PulseWireNewsScreen function
start_idx = code.find('fun PulseWireNewsScreen')
if start_idx != -1:
    # find the matching closing brace for this function. It's a large function.
    # We know from before it ends around line 5872, right before "// =================== AD COMPANY PROMOTION APP SCREEN ==================="
    end_str = '// =================== AD COMPANY PROMOTION APP SCREEN ==================='
    end_idx = code.find(end_str, start_idx)
    if end_idx != -1:
        code = code[:start_idx] + code[end_idx:]

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(code)
print("Patched SmartphoneComponent.kt")
