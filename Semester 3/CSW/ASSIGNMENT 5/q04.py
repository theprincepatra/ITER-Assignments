with open("text.txt") as f:l=f.readlines()
print(len(l),sum(len(i.split()) for i in l),sum(len(i) for i in l))

# Output:
# 4 18 92
