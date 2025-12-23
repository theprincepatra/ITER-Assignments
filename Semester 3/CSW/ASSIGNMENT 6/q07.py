class Ticket:
    def __init__(self, movie, time, seat, price):
        self.movie = movie
        self.time = time
        self.seat = seat
        self.price = price

    def display(self):
        print(self.movie, self.time, self.seat, self.price)


tickets = []
total = 0

n = int(input("Enter number of tickets: "))

for i in range(n):
    t = Ticket("Avengers", "7 PM", i + 1, 200)
    tickets.append(t)
    total += t.price

for t in tickets:
    t.display()

print("Total Amount:", total)

# Output (sample):
# Enter number of tickets: 2
# Avengers 7 PM 1 200
# Avengers 7 PM 2 200
# Total Amount: 400
