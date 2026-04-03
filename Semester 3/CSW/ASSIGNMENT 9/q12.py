import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import skew, norm

A = np.array([[1, 2], [3, 4]])
B = np.array([[0, 5], [6, 7]])

K = np.kron(A, B).flatten()

plt.hist(K, bins=10, edgecolor='black')
plt.hist(K, bins=50, edgecolor='black', alpha=0.5)
x = np.linspace(min(K), max(K), 100)
plt.plot(x, norm.pdf(x, np.mean(K), np.std(K)))
plt.show()

print(np.mean(K), np.var(K), skew(K))

# Output:
# Histogram plotted
# Mean, variance, skewness printed
