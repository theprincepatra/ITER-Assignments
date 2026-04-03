import numpy as np

temps = np.array([28, 30, 35, 36, 33, 29, 40, 38, 31, 27, 34, 32, 37, 39])

heat_wave = temps >= 35
count_heat = np.sum(heat_wave)

temps[temps < 30] = 30
comfortable = temps[(temps >= 30) & (temps <= 34)]
temps[heat_wave] += 2

print("Heat-wave days:", heat_wave)
print("Count:", count_heat)
print("Updated temperatures:", temps)
print("Comfortable days:", comfortable)

# Heat-wave days: [False False  True  True False False  True  True False False False False  True  True]
# Count: 6
# Updated temperatures: [30 30 37 38 33 30 42 40 31 30 34 32 39 41]
# Comfortable days: [30 33 30 31 30 34 32]
