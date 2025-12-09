# 5) starts with 'c', 2nd letter vowel, ends with consonant
import re

def match_word(w):
    pattern = r'^c[aeiou][bcdfghjklmnpqrstvwxyz]$'
    return bool(re.fullmatch(pattern, w))

print(match_word("cat"))
print(match_word("cut"))
print(match_word("caa"))

# output:
# True
# True
# False
