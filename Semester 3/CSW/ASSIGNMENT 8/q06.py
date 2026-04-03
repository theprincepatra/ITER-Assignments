import numpy as np

def generate_array():
    return np.random.randn(1000)

def analyze_distribution(arr):
    mean = np.mean(arr)
    std = np.std(arr)
    return {
        "within_1_std": np.sum((arr >= mean-std) & (arr <= mean+std)),
        "within_2_std": np.sum((arr >= mean-2*std) & (arr <= mean+2*std)),
        "within_3_std": np.sum((arr >= mean-3*std) & (arr <= mean+3*std))
    }

data = generate_array()
result = analyze_distribution(data)

print(result)

# {'within_1_std': 684, 'within_2_std': 954, 'within_3_std': 997}
