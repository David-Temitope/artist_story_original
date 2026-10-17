with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

start = text.find('fun PulseWireNewsScreen')
end = text.find('fun AdCompanyPromotionScreen')
lines = text[start:end].split('\n')

balance = 0
for i, line in enumerate(lines):
    balance += line.count('{') - line.count('}')
    print(f"{balance:3d} | {line}")
