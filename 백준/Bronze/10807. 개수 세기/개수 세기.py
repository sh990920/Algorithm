a = int(input())
b = list(input().split())
c = int(input())
d = 0
for i in range(a):
    if c == int(b[i]):
        d += 1

print(d)