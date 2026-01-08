import numpy as np
import random
import time

start = time.time()
arr_np = np.random.random((1000, 1000))
t_np = time.time() - start

start = time.time()
arr_py = [[random.random() for _ in range(1000)] for _ in range(1000)]
t_py = time.time() - start

print("NumPy:", t_np)
print("Python:", t_py)
print("Faster:", "NumPy" if t_np < t_py else "Python")

# NumPy: 0.02
# Python: 1.92
# Faster: NumPy
