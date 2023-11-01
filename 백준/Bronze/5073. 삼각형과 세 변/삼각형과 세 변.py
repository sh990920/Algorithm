while True:
    list_num = list(map(int, input().split()))
    if(list_num[0] + list_num[1] + list_num[2] == 0):
        break
    if(list_num[0] == list_num[1] and list_num[0] == list_num[2] and list_num[1] == list_num[2]):
        print("Equilateral")
        continue
    big_num = 0
    for i in list_num:
        if(big_num < i):
            big_num = i
    if(((list_num[0] + list_num[1] + list_num[2]) / 2) <= float(big_num)):
        print("Invalid")
    else:
        if(list_num[0] == list_num[1] or list_num[0] == list_num[2] or list_num[1] == list_num[2]):
            print("Isosceles")
        else:
            print("Scalene")