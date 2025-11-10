# Q4: Sales function using *args and **kwargs
def sales_report(*args, **kwargs):
    total_sales = sum(args)
    print("Total Sales Amount:", total_sales)
    print("Number of Extra Information Items:", len(kwargs))
    print("\nExtra Information Provided:")
    for key, value in kwargs.items():
        print(f"{key}: {value}")

# Example call
sales_report(2500, 4000, 6000, Name="John Doe", Date="2025-11-01", Location="Bhubaneswar")

# output:
# Total Sales Amount: 12500
# Number of Extra Information Items: 3

# Extra Information Provided:
# Name: John Doe
# Date: 2025-11-01
# Location: Bhubaneswar
