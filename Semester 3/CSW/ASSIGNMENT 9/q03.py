import numpy as np

A = np.random.randint(1, 21, 24).reshape(6, 4)
B = A[:2, :]
C = A[2:, :]
D = B @ C

print(A)
print(B)
print(C)
print(D)

# Output:
# A, B, C matrices printed
# D is a 2x4 matrix
