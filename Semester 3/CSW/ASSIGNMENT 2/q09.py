#9: Filter eligible candidates based on age
data = [
    ("Amit", 22, "Indian"),("John", 30, "USA"),("Neha", 17, "Indian"),("Ravi", 19, "Indian")
]

eligible = list(filter(lambda x: x[1] >= 18 and x[2] == "Indian", data))
result = {
    "Eligible": [x[0] for x in eligible],
    "Not Eligible": [x[0] for x in data if x not in eligible]
}

print("Eligible:", result["Eligible"])
print("Count:", len(result["Eligible"]))
print("Result:", result)

# output:
# Eligible: ['Amit', 'Ravi']
# Count: 2
# Result: {'Eligible': ['Amit', 'Ravi'], 'Not Eligible': ['John', 'Neha']}
