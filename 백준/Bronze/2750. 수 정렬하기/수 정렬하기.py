c = int(input())
num_list = []
for i in range(c):
    a = int(input())
    num_list.append(a)

for i in range(len(num_list)):
    for j in range(i):
        if(num_list[i] < num_list[j]):
            b = num_list[j]
            num_list[j] = num_list[i]
            num_list[i] = b

for i in num_list:
    print(i)