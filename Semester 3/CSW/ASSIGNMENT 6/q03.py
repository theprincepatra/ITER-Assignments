class Person:
    def __init__(self, gender):
        self.gender = gender


class College:
    def __init__(self):
        self.student1 = Person("female")
        self.student2 = Person("male")


college = College()
print("Student 1 Gender:", college.student1.gender)
print("Student 2 Gender:", college.student2.gender)

# Output:
# Student 1 Gender: female
# Student 2 Gender: male
