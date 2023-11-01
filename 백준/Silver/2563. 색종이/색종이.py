list_a = []
for i in range(100):
    list_b = []
    for j in range(100):
        list_b.append(0)
    list_a.append(list_b)
count = int(input())
for i in range(count):
    a, b = map(int, input().split())
    for j in range(10):
        for k in range(10):
            list_a[a + j][b + k] = 1
total = 0
for i in range(len(list_a)):
    for j in range(len(list_a[i])):
        if(list_a[i][j] == 1):
            total += 1
print(total)