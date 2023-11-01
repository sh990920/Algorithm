n, k = map(int, input().split())
num_list = list(map(int, input().split()))

for i in range(len(num_list)):
    for j in range(i):
        if(num_list[i] > num_list[j]):
            a = num_list[i]
            num_list[i] = num_list[j]
            num_list[j] = a

print(num_list[k - 1])