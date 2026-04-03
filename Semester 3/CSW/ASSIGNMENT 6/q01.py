class Student:
    def __init__(self, name, roll):
        self.name = name
        self.roll = roll

    def display(self):
        print("Name:", self.name, "Roll No:", self.roll)


students = []
n = int(input("Enter number of students: "))

for i in range(n):
    name = input("Enter name: ")
    roll = input("Enter roll number: ")
    students.append(Student(name, roll))

print("\nStudent Details:")
for s in students:
    s.display()

# Output (sample):
# Enter number of students: 2
# Enter name: Rahul
# Enter roll number: 1
# Enter name: Aman
# Enter roll number: 2
#
# Student Details:
# Name: Rahul Roll No: 1
# Name: Aman Roll No: 2
