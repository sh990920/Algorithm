n, m = map(int, input().split())
a = []
for i in range(n):
    a.append(i + 1)


for i in range(m):
    b, c = map(int, input().split())
    tmp = a[b - 1]
    a[b - 1] = a[c - 1]
    a[c - 1] = tmp

for i in a:
    print(i, end = " ")