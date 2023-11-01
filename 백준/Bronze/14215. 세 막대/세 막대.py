list_number = list(map(int, input().split()))
big_num = 0
for i in list_number:
    if(big_num < i):
        big_num = i
while (((list_number[0] + list_number[1] + list_number[2]) / 2) <= float(big_num)):
    idx = list_number.index(big_num)
    list_number[idx] -= 1
    big_num -= 1
print(list_number[0] + list_number[1] + list_number[2])