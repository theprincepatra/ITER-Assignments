# Q10: Average marks, skill frequency, and top student
students = [
    {"info": (1, "Amit"), "marks": [78, 85, 90], "skills": {"Python", "C"}},
    {"info": (2, "Neha"), "marks": [88, 92, 95], "skills": {"Java", "Python"}},
    {"info": (3, "Ravi"), "marks": [70, 80, 75], "skills": {"C", "C++"}}
]

avg_marks = {s["info"][1]: sum(s["marks"]) / len(s["marks"]) for s in students}
all_skills = [skill for s in students for skill in s["skills"]]
skill_freq = {sk: all_skills.count(sk) for sk in set(all_skills)}

top_student = max(avg_marks, key=avg_marks.get)

print("Average Marks:", avg_marks)
print("Skill Frequency:", skill_freq)
print("Top Performing Student:", top_student)

# output:
# Average Marks: {'Amit': 84.33333333333333, 'Neha': 91.66666666666667, 'Ravi': 75.0}
# Skill Frequency: {'C++': 1, 'Java': 1, 'Python': 2, 'C': 2}
# Top Performing Student: Neha
