d = 0.0
e = 0
dic_num = {"A+" : 4.5, "A0" : 4.0, "B+" : 3.5, "B0" : 3.0, "C+" : 2.5, "C0" : 2.0, "D+" : 1.5, "D0" : 1.0, "F" : 0.0}
for i in range(20):
    c = list(map(str, input().split()))
    if(c[2] != "P"):
        b = dic_num[c[2]]
        a = float(c[1])
        e += float(c[1])
        d += b * a
print(d / e)