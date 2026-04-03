# 3)normalize phone numbers
import re
def normalize_phones(s):
    pattern = r'(?:\+91-|0091|91|\(91\))\s*[- ]?(\d{5})[- ]?(\d{5})'
    return re.sub(pattern, r'+91-\1\2', s)

text = "Contact: +91-9876543210, Office: (91) 98765 43210, Home: 0091 9876543210"
print(normalize_phones(text))
