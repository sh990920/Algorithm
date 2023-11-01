list_a = [1, 1, 2, 2, 2, 8]
list_b = list(map(int, input().split()))
list_c = []
for i in range(len(list_b)):
    if(list_a[i] != list_b[i]):
        list_c.append(list_a[i] - list_b[i])
    else:
        list_c.append(0)
for i in list_c:
    print(i, end=" ")