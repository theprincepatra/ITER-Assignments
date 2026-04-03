# Q7: Sensor data stream generator

import random

def sensor_data_stream():
    while True:
        yield round(random.uniform(20.0, 30.0), 2)

# Display first 10 readings
gen = sensor_data_stream()
for i in range(10):
    print(f"Reading {i+1}: {next(gen)}°C")

# output:
# Reading 1: 21.58°C
# Reading 2: 23.99°C
# Reading 3: 27.33°C
# Reading 4: 29.6°C
# Reading 5: 22.91°C
# Reading 6: 24.05°C
# Reading 7: 22.75°C
# Reading 8: 24.44°C
# Reading 9: 21.85°C
# Reading 10: 27.49°C
