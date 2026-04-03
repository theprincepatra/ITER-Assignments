import numpy as np

mat = np.array([np.random.randint(i+1, i+9, 5) for i in range(4)])

row_mean = mat.mean(axis=1)
col_mean = mat.mean(axis=0)

row_std = mat.std(axis=1)
col_std = mat.std(axis=0)

result = {
    "mean": "row-wise" if row_mean.mean() > col_mean.mean() else "column-wise",
    "std": "row-wise" if row_std.mean() > col_std.mean() else "column-wise"
}

print(mat)
print(result)

# [[2 5 7 3 6]
#  [3 6 9 4 7]
#  [4 8 6 10 9]
#  [6 7 9 11 10]]
# {'mean': 'column-wise', 'std': 'row-wise'}
