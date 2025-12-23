class Car:
    def __init__(self, v1, v2):
        self.make = v1
        self.model = v2

    def get_make(self):
        return self.make

    def get_model(self):
        return self.model

    def set_make(self, make):
        self.make = make

    def set_model(self, model):
        self.model = model


car1 = Car("Toyota", "Innova")
car2 = Car(None, None)

print(car1.get_make(), car1.get_model())
print(car2.get_make(), car2.get_model())

car2.set_make("Honda")
car2.set_model("City")

print("Updated:", car2.get_make(), car2.get_model())

# Output:
# Toyota Innova
# None None
# Updated: Honda City
