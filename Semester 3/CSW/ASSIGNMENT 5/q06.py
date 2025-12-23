import os,datetime
if os.path.exists("diary.txt"):print("File already exists")
else:
    with open("diary.txt","w") as f:
        f.write(str(datetime.date.today())+"\n"+input())

# Output:
# Enter diary note:
