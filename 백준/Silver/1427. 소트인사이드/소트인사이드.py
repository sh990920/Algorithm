input_list = list(input())
int_list = list(map(int, input_list))
int_list.sort(reverse=True)
for i in int_list:
    print(i, end="")