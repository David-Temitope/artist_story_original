with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    content = f.read()

content = content.replace("remember \{ mutableStateOf(\"Campaigns\") \}", 'remember { mutableStateOf("Campaigns") }')
content = content.replace("listOf\(\"Campaigns\", \"Advertisers\", \"Analytics\"\)", 'listOf("Campaigns", "Advertisers", "Analytics")')

# Let's just fix all \ { \ ( \ ) in the AdCompanyPromotionScreen block
start = content.find("fun AdCompanyPromotionScreen")
end = content.find("fun MerchStudioAppScreen")

if start != -1 and end != -1:
    block = content[start:end]
    block = block.replace("\{", "{").replace("\}", "}").replace("\(", "(").replace("\)", ")").replace('\\"', '"')
    content = content[:start] + block + content[end:]
    
with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(content)
