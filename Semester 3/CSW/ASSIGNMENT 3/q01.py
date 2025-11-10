# Q1: Multiple assignment and tuple unpacking

x, y, z = map(int, input("Enter three numbers separated by spaces: ").split())
print(f"Before swapping: x = {x}, y = {y}, z = {z}")

y, z = z, y
print(f"After swapping: x = {x}, y = {y}, z = {z}")

# output:
# Before swapping: x = 1, y = 2, z = 3
# After swapping: x = 1, y = 3, z = 2
