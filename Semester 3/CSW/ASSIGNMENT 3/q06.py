# Q6: Generator for filtering high sales
def filter_high_sales(sales, threshold):
    for s in sales:
        if s >= threshold:
            yield s

sales = [250, 800, 450, 1200, 600]
threshold = 500

print("Daily Sales:", sales)
print("Threshold:", threshold)
print("High Sales:")
for s in filter_high_sales(sales, threshold):
    print(s)

# output:
# Daily Sales: [250, 800, 450, 1200, 600]
# Threshold: 500
# High Sales:
# 800
# 1200
# 600
