a, b = map(int, input().split())
res_list = []

for i in range(a):
    if(a % (i + 1) == 0):
        res_list.append(i + 1)

if(len(res_list) < b):
    print(0)
else:
    print(res_list[b - 1])