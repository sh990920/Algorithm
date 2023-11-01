c = int(input())
grid_list = []
for i in range(c):
    li = list(map(int, input().split()))
    grid_list.append(li)

grid_list.sort()

for i in grid_list:
    print(f"%d %d" %(i[0], i[1]))