def validate_password(password):
    errors = []

    # Rule checks
    if len(password) < 8:
        errors.append("Password must be at least 8 characters long.")

    if not any(ch.isupper() for ch in password):
        errors.append("Password must contain at least one uppercase letter.")

    if not any(ch.islower() for ch in password):
        errors.append("Password must contain at least one lowercase letter.")

    if not any(ch.isdigit() for ch in password):
        errors.append("Password must contain at least one digit.")

    special = "!@#$%"
    if not any(ch in special for ch in password):
        errors.append("Password must contain at least one special character (!@#$%).")

    if " " in password:
        errors.append("Password must not contain spaces.")

    # Final result
    if len(errors) == 0:
        return True, []
    else:
        return False, errors


# Taking input from user
pwd = input("Enter a password: ")
valid, msgs = validate_password(pwd)

if valid:
    print("Password is valid.")
else:
    print("Password is invalid:")
    for m in msgs:
        print("-", m)

# output:
# Pass@123
# Password is valid.
