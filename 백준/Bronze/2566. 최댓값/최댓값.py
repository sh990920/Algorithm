list_a = []
for i in range(9):
    list_a.append(list(map(int, input().split())))

big = 0
height = 0
width = 0
for i in range(len(list_a)):
    for j in range(len(list_a[i])):
        if(big <= list_a[i][j]):
            big = list_a[i][j]
            height = i + 1
            width = j + 1
print(big)
print(height, width)