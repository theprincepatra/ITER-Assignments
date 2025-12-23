class Demo:
    def __new__(cls):
        print("__new__ method called")
        obj = object.__new__(cls)
        return obj

    def __init__(self):
        print("__init__ method called")


d = Demo()


class MyInt(int):
    def __new__(cls, value):
        print("Creating immutable object")
        return super().__new__(cls, value + 10)


x = MyInt(5)
print(x)

# Output:
# __new__ method called
# __init__ method called
# Creating immutable object
# 15
