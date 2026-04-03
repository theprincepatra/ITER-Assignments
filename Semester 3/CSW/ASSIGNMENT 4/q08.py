# 8) extract date parts
import re

def extract_date_parts(s):
    pattern = r"(\d{2})-(\d{2})-(\d{4})"
    m = re.search(pattern, s)
    if m:
        return (
            m.group(0), m.group(1), m.group(2), m.group(3), m.span(), m.lastindex
        )
    else:
        return None
    
print(extract_date_parts("Today's date is 15-08-2023."))

# output:
# ('15-08-2023', '15', '08', '2023', (16, 26), 3)
