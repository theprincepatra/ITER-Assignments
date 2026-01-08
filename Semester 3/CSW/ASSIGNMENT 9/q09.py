import numpy as np
import matplotlib.pyplot as plt

t = np.arange(0, 31, 1/12)
P = 10000
r = 0.05

A = P * (1 + r)**t
Q = P * (1 + r/4)**(4*t)
M = P * (1 + r/12)**(12*t)

plt.plot(t, A, label='Annual')
plt.plot(t, Q, label='Quarterly')
plt.plot(t, M, label='Monthly')
plt.legend()
plt.show()

# Output:
# Investment growth comparison plotted
