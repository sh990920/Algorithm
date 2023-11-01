str1, str2 = map(str, input().split())
str3 = ""
res = 0;
for i in range(len(str1) - 1, -1, -1):
    str3 += str1[i]

for i in range(len(str3)):
    if i > 0:
        if str3[i].isdigit():
            res += (int(str3[i]) * (int(str2) ** i))
        else:
            res += ((ord(str3[i]) - 65 + 10) * (int(str2) ** i))
    else:
        if str3[i].isdigit():
            res += (int(str3[i]))
        else:
            res += (ord(str3[i]) - 65 + 10)

print(res)