p="Roses are red\nViolets are blue\nPython is fun\nAnd so are you"
with open("poem.txt","w") as f:f.write(p)
with open("poem.txt") as f:
    for l in f:print(l.strip())

# Output:
# Roses are red
# Violets are blue
# Python is fun
# And so are you
