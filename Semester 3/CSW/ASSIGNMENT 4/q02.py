# 2)Password validator
import re

def verify_passwd(s):
    rule1 = re.search(r'.{8,}', s)   # length >= 8
    rule2 = re.search(r'[A-Za-z]', s)  # at least one letter
    rule3 = re.search(r'\d', s)      # at least one digit
    rule4 = re.search(r'[@#$%^&*!]', s)     # at least one special char

    return bool(rule1 and rule2 and rule3 and rule4)

tests = "Pass123!", "hello", "Abc$1234", "12345678", "Test@12"

for t in tests:
    print(t, "=>", verify_passwd(t))
