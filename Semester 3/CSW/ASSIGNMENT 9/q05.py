import numpy as np

def matrix_stats(m):
    return np.min(m), np.max(m), np.mean(m), np.median(m), m.size, np.std(m), np.sum(m)

def separate_even_odd(m):
    even = np.where(m % 2 == 0, m, 0)
    odd = np.where(m % 2 != 0, m, 0)
    return even, odd

M = np.array([[1,2,3],[4,5,6],[7,8,9]])

print(matrix_stats(M))
print(separate_even_odd(M))

# Output:
# (1, 9, 5.0, 5.0, 9, 2.581988897471611, 45)
# (EvenMatrix, OddMatrix)
