# Q7: Comprehensions and lambda sorting

nums = [4, 2, 7, 4, 2, 4, 9, 7, 9, 9]

unique_nums = {n for n in nums}
freq = {n: nums.count(n) for n in unique_nums}
sorted_freq = dict(sorted(freq.items(), key=lambda x: x[1], reverse=True))
print("Unique numbers:", unique_nums)
print("Frequency:", freq)
print("Sorted by frequency:", sorted_freq)

# output:
# Unique numbers: {9, 2, 4, 7}
# Frequency: {9: 3, 2: 2, 4: 3, 7: 2}
# Sorted by frequency: {9: 3, 4: 3, 2: 2, 7: 2}
