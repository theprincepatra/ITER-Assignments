import pickle
d={"Alice":(20,"A"),"Bob":(19,"B"),"Charlie":(21,"A")}
with open("s.pkl","wb") as f:pickle.dump(d,f)
with open("s.pkl","rb") as f:print(pickle.load(f))

# Output:
# {'Alice': (20, 'A'), 'Bob': (19, 'B'), 'Charlie': (21, 'A')}
