import numpy as np
import matplotlib.pyplot as plt

v1 = np.array([1, 2])
v2 = np.array([4, 3])

v1n = v1 / np.linalg.norm(v1)
v2n = v2 / np.linalg.norm(v2)

plt.quiver(0, 0, v1n[0], v1n[1], color='g', angles='xy', scale_units='xy', scale=1, label='v1')
plt.quiver(0, 0, v2n[0], v2n[1], color='r', angles='xy', scale_units='xy', scale=1, label='v2')
plt.legend()
plt.show()

# Output:
# Normalized vectors plotted from origin
