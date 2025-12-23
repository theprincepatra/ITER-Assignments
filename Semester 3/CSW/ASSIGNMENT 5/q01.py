names=["Alice","Bob","Charlie","David","Eva"]
with open("students.txt","w") as f:f.write("\n".join(names))
with open("students.txt") as f:print(f.read())

# output:
# Alice
# Bob
# Charlie
# David
# Eva
