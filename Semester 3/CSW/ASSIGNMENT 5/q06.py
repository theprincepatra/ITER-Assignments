# a)
import os,datetime
if os.path.exists("diary.txt"):print("File already exists")
else:
    with open("diary.txt","w") as f:
        f.write(str(datetime.date.today())+"\n"+input())
# Output:
# Enter diary note:

# b)
try:
    with open("diary.txt") as f:print(f.read())
except FileNotFoundError:
    print("File not found. Please check the name.")

# Output:
# 2025-12-23
# Today was a good day.
