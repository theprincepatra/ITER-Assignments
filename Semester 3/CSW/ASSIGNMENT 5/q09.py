import struct
print(struct.pack("<H",1025),struct.pack(">H",1025))

# Output:
# b'\x01\x04' b'\x04\x01'
