# Q5: Timer decorator-import time, random

def timer(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f"Time taken: {end - start:.2f} seconds")
        return result
    return wrapper

@timer
def demo_function():
    sleep_time = random.uniform(0.5, 1.5)
    print(f"Sleeping for {sleep_time:.2f} seconds...")
    time.sleep(sleep_time)

demo_function()

# output:
# Sleeping for 0.70 seconds...
# Time taken: 0.70 seconds
