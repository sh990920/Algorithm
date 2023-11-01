n, m = map(int, input().split())
count = 0
list_a = []
for i in range(n):
    list_a.append(i + 1)

for i in range(m):
    x, y = map(int, input().split())
    for j in range(x - 1, y - 1):
        num = list_a.pop(y - 1)
        list_a.insert(j, num)

for i in list_a:
    print(i, end=" ")