# Q8: Filter and process valid emails

emails = ["test@gmail.com", "hello123", "abc@org", "world@yahoo.com"]

valid_emails = list(filter(lambda e: e.endswith(".com") or e.endswith(".org"), emails))
domains = [e.split('@')[1].split('.')[0] for e in valid_emails]
domain_freq = {d: domains.count(d) for d in set(domains)}

print("Valid Emails:", valid_emails)
print("Domains:", domains)
print("Domain Frequency:", domain_freq)

# output:
# Valid Emails: ['test@gmail.com', 'world@yahoo.com']
# Domains: ['gmail', 'yahoo']
# Domain Frequency: {'gmail': 1, 'yahoo': 1}
