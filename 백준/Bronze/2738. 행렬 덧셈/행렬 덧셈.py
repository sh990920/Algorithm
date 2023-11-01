a, b = map(int, input().split())
list_a = []
list_b = []
for i in range(a):
    list_a.append(list(map(int, input().split())))
for i in range(a):
    list_b.append(list(map(int, input().split())))

for i in range(a):
    for j in range(b):
        print(list_a[i][j] + list_b[i][j], end=" ")
    print()