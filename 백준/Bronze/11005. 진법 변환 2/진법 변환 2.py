a, b = map(int, input().split())
c = a
count = 0
while c >= b:
    c /= b
    count += 1
res = ""
for i in range(count, -1, -1):
    if i > 0:
        d = a // (b ** i)
        a = a % (b ** i)
        if(d >= 10):
            res = res + chr(d - 10 + 65)
        else:
            res += str(d)
    else:
        d = a
        if(d >= 10):
            res += chr(d - 10 + 65)
        else:
            res += str(d)
print(res)