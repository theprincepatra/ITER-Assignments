# 4) 1st substring of >1 digit
import re

s = "1 set of 23 owls, 999 doves."
m = re.search(r'\d{2,}', s)
print(m.group(), "found at", m.span())

# output:
# 23 found at (9, 11)
