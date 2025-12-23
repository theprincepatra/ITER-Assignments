with open("sample.txt") as f:
    print(f.read(10));f.seek(0);print(f.read())

# Output:
# Hello worl
# Hello world! This is a sample file.
