import string

sentence = input("Enter a sentence: ")
sep = input("Enter a custom separator: ")

# Remove punctuation
for p in string.punctuation:
    sentence = sentence.replace(p, "")

# Split into words and sort in reverse alphabetical order
words = sentence.lower().split()
words.sort(reverse=True)

# Join with custom separator
result = sep.join(words)

print(result)

# output:
# Hello, world! Python.
# —
# world—python—hello
