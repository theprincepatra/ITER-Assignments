#5) base convertor
n = int(input("Decimal number: "))
b = bin(n)[2:]
o = oct(n)[2:]
h = hex(n)[2:]
print("Binary:", b, "digits:", len(b))
print("Octal:", o, "digits:", len(o))
print("Hex :", h, "digits:", len(h))
print("From binary:", int(b, 2))
print("From octal :", int(o, 8))
print("From hex :", int(h, 16))

# output:
# Binary: 1100 digits: 4
# Octal: 14 digits: 2
# Hex : c digits: 1
# From binary: 12
# From octal : 12
# From hex : 12
