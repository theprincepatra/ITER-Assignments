# 7) greedy vs lazy matching
import re

text = "Random <tag>first</tag> some text <tag>second</tag> end"

# (a) greedy
print(re.search(r"<tag>.*</tag>", text).group())

# (b) lazy
print(re.findall(r"<tag>.*?</tag>", text))

# output:
# <tag>first</tag> some text <tag>second</tag>
# ['<tag>first</tag>', '<tag>second</tag>']
