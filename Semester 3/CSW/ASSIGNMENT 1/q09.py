text = input("Enter a paragraph: ")

# Remove extra spaces
clean_text = " ".join(text.split())

# Convert to title case
title_text = clean_text.title()

# Count vowels
vowels = {'A': 0, 'E': 0, 'I': 0, 'O': 0, 'U': 0}

for ch in title_text.upper():
    if ch in vowels:
        vowels[ch] += 1

print("Processed Text:", title_text)
print("Vowel Counts:")
for v, c in vowels.items():
    print(f"{v}: {c}")

# output:
#this is  an example paragraph
# Processed Text: This Is An Example Paragraph
# Vowel Counts:
# A: 3
# E: 2
# I: 1
# O: 0
# U: 0

