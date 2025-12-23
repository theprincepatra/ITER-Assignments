import struct
a=[10,20,30,40,50]
with open("n.bin","wb") as f:
    for i in a:f.write(struct.pack("i",i))
with open("n.bin","rb") as f:
    print([struct.unpack("i",f.read(4))[0] for _ in a])

# Output:
# [10, 20, 30, 40, 50]
