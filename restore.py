import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    lines = f.readlines()

out = []
i = 0
while i < len(lines):
    line = lines[i]
    if line.startswith("//") and i > 0:
        prev = out[-1].rstrip("\n")
        
        # Case 1: prev is exactly "}"
        if prev == "}":
            out.pop() # remove the inserted "}"
            
            # find next non-empty, non-comment line for indentation
            indent = "        " # default
            for j in range(i+1, len(lines)):
                nl = lines[j]
                if nl.strip() and not nl.strip().startswith("//"):
                    indent = nl[:len(nl) - len(nl.lstrip())]
                    break
                    
            out.append(indent + line)
            
        # Case 2: prev is just spaces and "}"
        elif prev.strip() == "}" and len(prev) > 1:
            out.pop()
            out.append(prev + " " + line)
            
        # Case 3: prev has code and ends with "}"
        elif prev.endswith("}") and prev.strip() != "}":
            out.pop()
            # strip the trailing }
            prev = prev[:-1]
            out.append(prev + " " + line)
        else:
            # Not modified by our sed? Just in case.
            out.append(line)
    else:
        out.append(line)
    i += 1

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.writelines(out)

print("Done restoring!")
