class Product:
    total_products_sold = 0

    def __init__(self, name, price, qty):
        self.name = name
        self.price = price
        self.quantity = qty

    def sell_product(self, amount):
        if amount <= self.quantity:
            self.quantity -= amount
            Product.total_products_sold += amount

    @classmethod
    def get_total_products_sold(cls):
        return cls.total_products_sold


p1 = Product("Pen", 10, 50)
p1.sell_product(5)

p2 = Product("Book", 100, 20)
p2.sell_product(3)

print("Total Sold:", Product.get_total_products_sold())

# Output:
# Total Sold: 8
