import numpy as np

sugar = np.array([90, 110, 145, 130, 85, 160, 100])

result = np.empty(sugar.shape, dtype=object)

result[sugar < 100] = "Normal"
result[(sugar >= 100) & (sugar <= 139)] = "Pre-Diabetic"
result[sugar >= 140] = "Diabetic"

print("Blood Sugar:", sugar)
print("Condition:", result)

# Blood Sugar: [ 90 110 145 130  85 160 100]
# Condition: ['Normal' 'Pre-Diabetic' 'Diabetic' 'Pre-Diabetic' 'Normal' 'Diabetic' 'Pre-Diabetic']
