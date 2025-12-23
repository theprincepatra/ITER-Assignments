try:
    with open("data.txt") as f:print(f.read())
except FileNotFoundError:
    print("Error: File not found.")

# Output:
# Error: File not found.
