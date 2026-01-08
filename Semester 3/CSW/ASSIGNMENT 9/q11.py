import numpy as np
import matplotlib.pyplot as plt

M = np.random.rand(4, 4)
det = np.linalg.det(M)

if det == 0:
    M[0][0] += 1
    det = np.linalg.det(M)

Minv = np.linalg.inv(M)
I = M @ Minv

plt.subplot(1, 2, 1)
plt.imshow(M, cmap='Blues')
plt.colorbar()
plt.title("Matrix")

plt.subplot(1, 2, 2)
plt.imshow(Minv, cmap='Blues')
plt.colorbar()
plt.title("Inverse")

plt.suptitle(f"Determinant = {det}")
plt.show()

# Output:
# Matrix and its inverse heatmaps displayed
