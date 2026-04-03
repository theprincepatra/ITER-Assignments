class Book:
    def __init__(self, title, author, isbn, copies):
        self.title = title
        self.author = author
        self.isbn = isbn
        self.copies = copies

    def issue(self):
        if self.copies > 0:
            self.copies -= 1
            print("Book Issued")

    def return_book(self):
        self.copies += 1
        print("Book Returned")

    def available(self):
        return self.copies > 0


b1 = Book("Python", "Guido", "12345", 2)
b1.issue()
b1.return_book()
print("Available:", b1.available())

# Output:
# Book Issued
# Book Returned
# Available: True
