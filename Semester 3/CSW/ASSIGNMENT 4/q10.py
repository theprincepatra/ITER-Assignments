# 10) find repeated letters
import re

def find_repeated_letters(s):
    pattern = r"(.)\1+"
    for m in re.finditer(pattern, s):
        print("Repeated sequence:", m.group(0))
        print("Repeated character:", m.group(1))
        print("Span:", m.span())
        print()

test_str = "I loooove programming and coooodeeee!"
find_repeated_letters(test_str)

# output:
# Repeated sequence: oooo
# Repeated character: o
# Span: (3, 7)

# Repeated sequence: mm
# Repeated character: m
# Span: (16, 18)

# Repeated sequence: oooo
# Repeated character: o
# Span: (27, 31)

# Repeated sequence: eeee
# Repeated character: e
# Span: (32, 36)
