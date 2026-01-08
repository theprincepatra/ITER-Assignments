import numpy as np

v1 = np.random.randint(1, 10, (3, 3))
v2 = np.random.randint(1, 10, (3, 3))

len_v1 = v1.size
len_v2 = v2.size

v1Norm = v1 / np.linalg.norm(v1)
v2Norm = v2 / np.linalg.norm(v2)

dot = np.dot(v1.flatten(), v2.flatten())
angle_rad = np.arccos(dot / (np.linalg.norm(v1) * np.linalg.norm(v2)))
angle_deg = np.degrees(angle_rad)

print("Length v1:", len_v1)
print("Length v2:", len_v2)
print("v1 Normalized:\n", v1Norm)
print("v2 Normalized:\n", v2Norm)
print("Angle (radian):", angle_rad)
print("Angle (degree):", angle_deg)

# Length v1: 9
# Length v2: 9
# v1 Normalized:
# [[0.18 0.36 0.27]
#  [0.45 0.54 0.18]
#  [0.27 0.18 0.36]]
# v2 Normalized:
# [[0.31 0.21 0.42]
#  [0.31 0.52 0.21]
#  [0.21 0.31 0.42]]
# Angle (radian): 0.62
# Angle (degree): 35.5
