c = int(input())
grid_list = []
for i in range(c):
    a, b = map(int, input().split())
    li = [b, a]
    grid_list.append(li)

grid_list.sort()

for i in grid_list:
    print(f"%d %d" %(i[1], i[0]))