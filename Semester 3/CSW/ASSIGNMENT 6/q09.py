class Student:
    def __init__(self, name, roll):
        self.name = name
        self.roll = roll
        self.__marks = 0

    def set_marks(self, m):
        if 0 <= m <= 100:
            self.__marks = m

    def get_grade(self):
        if self.__marks >= 90:
            return "A"
        elif self.__marks >= 80:
            return "B"
        elif self.__marks >= 70:
            return "C"
        elif self.__marks >= 60:
            return "D"
        elif self.__marks >= 50:
            return "E"
        else:
            return "F"

    def show_details(self):
        print(self.name, self.roll, self.__marks, self.get_grade())


s1 = Student("Rahul", 1)
s1.set_marks(85)
s1.show_details()

# Output:
# Rahul 1 85 B
