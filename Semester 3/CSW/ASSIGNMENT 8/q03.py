import numpy as np
import random
import time

start = time.time()
arr_np = np.random.random((1000, 1000))
t_np = time.time() - start

start = time.time()
arr_py = [[random.random() for _ in range(1000)] for _ in range(1000)]
t_py = time.time() - start

print("NumPy time:", t_np)
print("Python time:", t_py)
print("Faster method:", "NumPy" if t_np < t_py else "Python")

# NumPy time: 0.03
# Python time: 1.85
# Faster method: NumPy
