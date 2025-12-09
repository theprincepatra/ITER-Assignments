# 6) lowercase letters followed by digits
import re

pattern = r'^[a-z]+[0-9]+$'
test_strings = ["abc123", "a1b2", "ABC123", "hello99"]

for s in test_strings:
    if re.match(pattern, s):
        print(s, "=> pass")
    else:
        print(s, "=> fail")

# output:
# abc123 => pass
# a1b2 => fail
# ABC123 => fail
# hello99 => pass
