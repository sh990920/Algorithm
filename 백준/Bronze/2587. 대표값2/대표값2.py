num_list = []
for i in range(5):
    num = int(input())
    num_list.append(num)

for i in range(len(num_list)):
    for j in range(i):
        if(num_list[i] < num_list[j]):
            a = num_list[j]
            num_list[j] = num_list[i]
            num_list[i] = a

result = 0
for i in num_list:
    result += i

print(int(result / 5))
print(num_list[2])