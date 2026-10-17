with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    lines = f.readlines()

balance = 0
for i, line in enumerate(lines):
    balance += line.count('{') - line.count('}')
    if 'fun ' in line and '@Composable' in lines[i-1] if i > 0 else False:
        print(f"Line {i+1}: {line.strip()} -> Balance: {balance}")

print(f"Final balance: {balance}")
