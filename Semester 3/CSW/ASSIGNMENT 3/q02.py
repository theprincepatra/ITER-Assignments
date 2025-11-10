# Q2: Command-line calculator
while True:
    cmd = input("Enter operation (add/sub/mul/div) or 'exit' to quit:\n")
    if cmd == "exit":
        print("Program terminated.")
        break
    try:
        op, a, b = cmd.split()
        a, b = float(a), float(b)

        if op == "add":
            print("Result:", a + b)
        elif op == "sub":
            print("Result:", a - b)
        elif op == "mul":
            print("Result:", a * b)
        elif op == "div":
            if b == 0:
                print("Error: Division by zero is not allowed.")
            else:
                print("Result:", a / b)
        else:
            print("Invalid operation.")
    except ValueError:
        print("Invalid input format.")

# output:
# Result: 13.0
# Error: Division by zero is not allowed.
# Program terminated.
