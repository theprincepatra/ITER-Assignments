# Q1: List operations on student scores

scores = [75, 60, 90, 50, 80, 95, 40]

average = sum(scores) / len(scores)
print("Average Score:", average)

print("Minimum Score:", min(scores))
print("Maximum Score:", max(scores))

above_avg = [s for s in scores if s > average]
print("Scores above average:", above_avg)

scores.sort(reverse=True)
print("Scores in descending order:", scores)

for i in range(-3, 0):
    scores[i] = 0
print("After replacing 3 lowest with 0:", scores)

# output:
# Average Score: 70.0
# Minimum Score: 40
# Maximum Score: 95
# Scores above average: [75, 90, 80, 95]
# Scores in descending order: [95, 90, 80, 75, 60, 50, 40]
# After replacing 3 lowest with 0: [95, 90, 80, 75, 0, 0, 0]
