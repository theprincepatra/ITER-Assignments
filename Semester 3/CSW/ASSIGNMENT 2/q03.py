# Q3: Stack using list

stack = []

def push(x):
    stack.append(x)

def pop():
    if not stack:
        print("Stack is empty!")
    else:
        print("Popped:", stack.pop())

def display():
    print("Stack:", stack)

def evaluate_rpn(expr):
    items = expr.split()
    temp = []
    for i in items:
        if i.isdigit():
            temp.append(int(i))
        else:
            b = temp.pop()
            a = temp.pop()
            if i == '+': temp.append(a + b)
            elif i == '-': temp.append(a - b)
            elif i == '*': temp.append(a * b)
            elif i == '/': temp.append(a / b)
    print("Result:", temp[0])

# Example usage:
push(40)
push(20)
display()
pop()
display()
evaluate_rpn("5 3 4 * +")

# output:
# Stack: [40, 20]
# Popped: 20
# Stack: [40]
# Result: 17
