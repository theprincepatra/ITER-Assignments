import numpy as np
import matplotlib.pyplot as plt

t = np.linspace(-10, 10, 100)
det = []

for i in t:
    M = np.array([[i, 1], [2, i+1]])
    det.append(np.linalg.det(M))

plt.plot(t, det)
plt.scatter(t, np.zeros_like(t), c='r')
plt.grid()
plt.show()

# Output:
# Determinant vs t plotted
