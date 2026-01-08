import numpy as np
import matplotlib.pyplot as plt

x = np.arange(0, 2*np.pi, 0.1)
y1 = np.sin(x)
y2 = np.cos(x)

plt.plot(x, y1, 'b-', label='Sine')
plt.plot(x, y2, 'r--', label='Cosine')
plt.xlabel("X values (radians)")
plt.ylabel("Function values")
plt.title("Sine and Cosine Functions")
plt.legend()
plt.show()

# Output:
# Sine and cosine curves displayed
