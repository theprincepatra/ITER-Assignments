#1: generate_bill()
def generate_bill(item, price, quantity=1, discount=0, tax_rate=0.05):
    subtotal = price * quantity
    subtotal -= subtotal * (discount / 100)
    total = subtotal + subtotal * tax_rate
    print(f"Item: {item}, Qty: {quantity}, Total Bill: {total}")
    return total

generate_bill("Laptop", 50000, 2, 10, 0.05)
generate_bill("Pen", 10)
generate_bill("Book", 100, quantity=3)
generate_bill("Phone", 20000, discount=5, tax_rate=0.1)

# output:
# Item: Laptop, Qty: 2, Total Bill: 94500.0
# Item: Pen, Qty: 1, Total Bill: 10.5
# Item: Book, Qty: 3, Total Bill: 315.0
# Item: Phone, Qty: 1, Total Bill: 20900.0
