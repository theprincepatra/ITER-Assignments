# 9) first uppercase letter followed by digit
import re

def find_upper_then_digit(s):
    pattern = r"([A-Z]).*\d"
    m = re.search(pattern, s)
    if m:
        return (m.group(1), m.start(1))
    else:
        return None

print(find_upper_then_digit("Example A123"))

# output:
# ('E', 0)
