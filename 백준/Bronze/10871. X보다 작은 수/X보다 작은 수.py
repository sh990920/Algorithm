a, b = map(int, input().split())
c = list(input().split())
d = ""
for i in range(a):
    if b > int(c[i]):
        d += c[i] + " "
print(d)