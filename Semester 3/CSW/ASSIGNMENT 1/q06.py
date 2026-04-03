#6 encrypt  and decrypt
def encrypt(s):
    s = s[::-1]
    chars = list(s)
    for i in range(0, len(chars) - 1, 2):
        chars[i], chars[i+1] = chars[i+1], chars[i]
    return "".join(chars)
def decrypt(s):
    chars = list(s)
    for i in range(0, len(chars) - 1, 2):
        chars[i], chars[i+1] = chars[i+1], chars[i]
    return "".join(chars)[::-1]
txt = input("Text: ")
enc = encrypt(txt)
dec = decrypt(enc)
print("Encrypted:", enc)
print("Decrypted:", dec)
