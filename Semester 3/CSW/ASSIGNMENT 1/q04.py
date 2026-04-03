import string

# -----------------------------------------
# Method 1: For-loop Palindrome Check
# Ignores only case (e.g., "Madam")
# -----------------------------------------
def is_palindrome_for_loop(text):
    text = text.lower()
    rev = ""

    # Create reversed string using a for loop
    for ch in text:
        rev = ch + rev

    return text == rev


# -----------------------------------------
# Method 2: Two-pointer Palindrome Check
# Ignores case, spaces, punctuation
# Suitable for sentences
# -----------------------------------------
def is_palindrome_two_pointer(text):
    # Remove spaces + punctuation + make lowercase
    cleaned = ""
    for ch in text.lower():
        if ch.isalnum():   # keep only a-z, 0-9
            cleaned += ch

    left = 0
    right = len(cleaned) - 1

    # Two-pointer technique
    while left < right:
        if cleaned[left] != cleaned[right]:
            return False
        left += 1
        right -= 1

    return True


# -----------------------------------------
# Main Program
# -----------------------------------------
user_input = input("Enter a string: ")

# Call both methods
result_for = is_palindrome_for_loop(user_input)
result_two = is_palindrome_two_pointer(user_input)

# Display results
print("For-loop Check:", "Palindrome" if result_for else "Not Palindrome")
print("Two-pointer Check:", "Palindrome" if result_two else "Not Palindrome")

# output:
# A man, a plan, a canal: Panama
# For-loop Check: Not Palindrome
# Two-pointer Check: Palindrome
