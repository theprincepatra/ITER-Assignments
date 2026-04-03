import numpy as np
import matplotlib.pyplot as plt

marks = np.random.randint(0, 101, (40, 5))
avg = marks.mean(axis=0)

plt.boxplot(marks)
plt.show()

print(np.sort(marks.flatten())[::-1])

# Output:
# Distribution plot shown
# Marks printed highest to lowest
