# Q4: Matrix operations using nested lists

A = [[1, 2], [3, 4]]
B = [[5, 6], [7, 8]]

# Sum
sum_matrix = [[A[i][j] + B[i][j] for j in range(2)] for i in range(2)]

# Product
product = [[A[i][0]*B[0][j] + A[i][1]*B[1][j] for j in range(2)] for i in range(2)]

# Sort by row sum
sorted_matrix = sorted(product, key=sum)

print("Matrix A:", A)
print("Matrix B:", B)
print("Sum:", sum_matrix)
print("Product:", product)
print("Sorted by row sum:", sorted_matrix)

# output:
# Matrix A: [[1, 2], [3, 4]]
# Matrix B: [[5, 6], [7, 8]]
# Sum: [[6, 8], [10, 12]]
# Product: [[19, 22], [43, 50]]
# Sorted by row sum: [[19, 22], [43, 50]]
