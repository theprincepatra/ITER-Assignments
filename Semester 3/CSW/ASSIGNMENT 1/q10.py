import string

sentence = input("Enter a sentence: ")

# Remove punctuation
for p in string.punctuation:
    sentence = sentence.replace(p, "")

# Convert to lowercase and split into words
words = sentence.lower().split()

# Count frequency
freq = {}
for w in words:
    freq[w] = freq.get(w, 0) + 1

# Display sorted result
for word in sorted(freq):
    print(f"{word}: {freq[word]}")

# output:
# Hello world, hello!
# hello: 2
# world: 1
