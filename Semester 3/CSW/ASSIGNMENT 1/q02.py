#2: Simple calculator
op = input("Operation (add/sub/mul/div/mod): ").strip().lower()
a = float(input("First number: "))
b = float(input("Second number: "))
if op == "add":
    print(f"{a}+{b}: {a + b}")
elif op == "sub":
    print(f"{a}-{b}: {a - b}")
elif op == "mul":
    print(f"{a}*{b}: {a * b}")
elif op == "div":
    print("Error: division by zero" if b == 0 else a / b)
elif op == "mod":
    print("Error: modulus by zero" if b == 0 else a % b)
else:
    print("Invalid operation")

# output:
# 1.0+4.0: 5.0
