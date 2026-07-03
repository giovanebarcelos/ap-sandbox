print("A B | A E B | A OU B")
for a in (True, False):
    for b in (True, False):
        print(int(a), int(b), " |  ", int(a and b), "   |  ", int(a or b))
