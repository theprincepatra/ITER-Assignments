#3 Days in month
month_days = {
"january": 31, "february": 28, "march": 31, "april": 30,
"may": 31, "june": 30, "july": 31, "august": 31,
"september": 30, "october": 31, "november": 30, "december": 31
}
m = input("Month name: ").strip().lower()
if m not in month_days:
    print("Invalid month")
else:
    if m == "february":
        y = int(input("Year: "))
        leap = (y % 400 == 0) or (y % 4 == 0 and y % 100 != 0)
        print(f"February {y} has {29 if leap else 28} days")
    else:
        print(f"{m.capitalize()} has {month_days[m]} days")

# output:
# January has 31 days
