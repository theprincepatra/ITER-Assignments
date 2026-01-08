import numpy as np
import random
import time

start = time.time()
a = np.random.rand(1000, 1000)
t1 = time.time() - start

start = time.time()
b = [[random.random() for _ in range(1000)] for _ in range(1000)]
t2 = time.time() - start

print(t1, t2)
print("NumPy Faster" if t1 < t2 else "Python Faster")

# Output:
# 0.02 1.35
# NumPy Faster
