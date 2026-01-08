import numpy as np

n = int(input("Enter matrix size: "))
matrix = np.random.randint(1, 10, (n, n))

trials = []

for i in range(n):
    hidden = matrix[i, np.random.randint(0, n)]
    count = 0
    while True:
        guess = int(input(f"Guess for row {i}: "))
        count += 1
        if guess == hidden:
            break
    trials.append(count)

print(trials)

# Enter matrix size: 2
# Guess for row 0: 3
# Guess for row 0: 7
# Guess for row 1: 5
# [2, 1]
