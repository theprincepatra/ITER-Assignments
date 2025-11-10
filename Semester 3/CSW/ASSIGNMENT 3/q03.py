# Q3: Advanced tuple assignment
nums = list(map(int, input("Enter integers separated by spaces: ").split()))

first, second, *rest = nums
print("First number:", first)
print("Second number:", second)
print("Remaining numbers:", rest)

first, second = second, first
print(f"After swapping: First: {first}, Second: {second}")

print("Sum of remaining numbers:", sum(rest))

first, *middle, last = nums
print("\nUnpacking Example:")
print("First:", first)
print("Middle:", middle)
print("Last:", last)

# output:
# First number: 1
# Second number: 2
# Remaining numbers: [3, 4, 5, 6, 7]
# After swapping: First: 2, Second: 1
# Sum of remaining numbers: 25

# Unpacking Example:
# First: 1
# Middle: [2, 3, 4, 5, 6]
# Last: 7
