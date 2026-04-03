# Q2: Classify integers into categories

def classify_numbers(nums):
    result = {"Prime": [], "Composite": [], "Perfect Squares": [], "Perfect Cubes": []}

    for n in nums:
        if n > 1:
            for i in range(2, int(n ** 0.5) + 1):
                if n % i == 0:
                    result["Composite"].append(n)
                    break
            else:
                result["Prime"].append(n)

        if int(n ** 0.5) ** 2 == n:
            result["Perfect Squares"].append(n)

        if round(n ** (1/3)) ** 3 == n:
            result["Perfect Cubes"].append(n)

    return result


nums = [2, 4, 8, 9, 27, 28]
print("Classification:", classify_numbers(nums))

# output:
# Classification: {'Prime': [2], 'Composite': [4, 8, 9, 27, 28], 'Perfect Squares': [4, 9], 'Perfect Cubes': [8, 27]}
