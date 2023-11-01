n, m = map(int, input().split())
a = []
for i in range(n):
    a.append(0)

for i in range(m):
    b, c, d = map(int, input().split())
    for j in range(b - 1, c):
        a[j] = d

for i in a:
    print(i, end = " ")