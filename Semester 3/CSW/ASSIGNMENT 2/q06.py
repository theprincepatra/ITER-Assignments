# Q6: Handle lists and tuples

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def process_data(data):
    new_dict = {}
    for key, value in data.items():
        if isinstance(value, list):
            new_dict[key] = sum(x for x in value if is_prime(x))
        elif isinstance(value, tuple):
            product = 1
            for x in value:
                if x % 2 != 0:
                    product *= x
            new_dict[key] = product
    return new_dict

data = {"A": [2, 3, 4, 5, 10], "B": (1, 2, 3, 4, 5), "C": [7, 8, 9], "D": (6, 7, 8)}
print("Result:", process_data(data))

# output:
# Result: {'A': 10, 'B': 15, 'C': 7, 'D': 7}
