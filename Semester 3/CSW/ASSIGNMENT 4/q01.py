# 1)Filtered emails
import re

lst = [
    "student123@gmail.com",
    "teacher.name@soa.edu",
    "abc.xyz@abc.in",
    "xyz#12@abc.com",
    "bad@1n.com"
]
pattern = r'^[A-Za-z0-9][A-Za-z0-9._]*@[A-Za-z]+\.[A-Za-z]{2,4}$'
filtered = [email for email in lst if re.match(pattern, email)]
print(filtered)
