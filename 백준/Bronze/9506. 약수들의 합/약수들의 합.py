while True:
    a = int(input())
    if(a == -1):
        break
    res_list = []

    for i in range(a):
        if(a % (i + 1) == 0):
            res_list.append(i + 1)
    sum = 0
    for i in range(len(res_list) - 1):
        sum += res_list[i]
    res_str = ""
    if sum == a:
        res_str = f"{a} = "
        for i in range(len(res_list) - 1):
            if(i == len(res_list) - 2):
                res_str += f"{res_list[i]}"
            else:
                res_str += f"{res_list[i]} + "
    else:
        res_str = f"{a} is NOT perfect."
    print(res_str)