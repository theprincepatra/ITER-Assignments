import numpy as np

v1 = np.random.randint(1, 50, size=10)

max_val = np.max(v1)
min_val = np.min(v1)
count_between = np.sum((v1 > min_val) & (v1 < max_val))

print("Array:", v1)
print("Maximum value:", max_val)
print("Minimum value:", min_val)
print("Elements between max and min:", count_between)

# Array: [12 45 23 45 7 30 18 7 40 23]
# Maximum value: 45
# Minimum value: 7
# Elements between max and min: 6
