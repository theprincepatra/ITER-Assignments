# Q5: Find student with highest average

students_scores = {
    "Ram": [85, 90, 92],
    "Lam": [70, 80, 88],
    "Bam": [95, 100, 90]
}

averages = {}
for name, scores in students_scores.items():
    averages[name] = sum(scores) / len(scores)

topper = max(averages, key=averages.get)

print("Average scores:", averages)
print("Topper:", topper)

# output:
# Average scores: {'Ram': 89.0, 'Lam': 79.33333333333333, 'Bam': 95.0}
# Topper: Bam
