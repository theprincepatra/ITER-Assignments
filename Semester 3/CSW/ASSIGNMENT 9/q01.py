import numpy as np

v1 = np.array([1, 2])
v2 = np.array([4, 3])

l1 = np.linalg.norm(v1)
l2 = np.linalg.norm(v2)

v1n = v1 / l1
v2n = v2 / l2

angle_rad = np.arccos(np.dot(v1n, v2n))
angle_deg = np.degrees(angle_rad)

print(l1, l2)
print(v1n)
print(v2n)
print(angle_rad, angle_deg)

# Output:
# 2.23606797749979 5.0
# [0.4472136  0.89442719]
# [0.8 0.6]
# 0.17985349979247847 10.304846468766033
