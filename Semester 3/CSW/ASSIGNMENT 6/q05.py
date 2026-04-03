class Image:
    def __init__(self, w=0, h=0, c="None"):
        self.imageWidth = w
        self.imageHeight = h
        self.colorCode = c

    def set_width(self, w):
        self.imageWidth = w

    def set_height(self, h):
        self.imageHeight = h

    def set_color(self, c):
        self.colorCode = c

    def __str__(self):
        return f"Width: {self.imageWidth}, Height: {self.imageHeight}, Color: {self.colorCode}"


img1 = Image()
img2 = Image(800, 600, "RGB")

print(img1)
print(img2)

# Output:
# Width: 0, Height: 0, Color: None
# Width: 800, Height: 600, Color: RGB
