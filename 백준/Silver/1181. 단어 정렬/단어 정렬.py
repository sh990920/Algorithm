c = int(input())
str_set = set()
str_list = []
for i in range(c):
    str_a = str(input())
    str_set.add(str_a)

str_list = list(str_set)

# str_list.sort()

for i in range(len(str_list)):
    for j in range(i):
        if(len(str_list[i]) < len(str_list[j])):
            a = str_list[j]
            str_list[j] = str_list[i]
            str_list[i] = a
        elif(len(str_list[i]) == len(str_list[j])):
            if(ord(str_list[i][0]) < ord(str_list[j][0])):
                a = str_list[j]
                str_list[j] = str_list[i]
                str_list[i] = a
            count = 0
            while(ord(str_list[i][count]) == ord(str_list[j][count])):
                count += 1
                if(ord(str_list[i][count]) < ord(str_list[j][count])):
                    a = str_list[j]
                    str_list[j] = str_list[i]
                    str_list[i] = a

for i in str_list:
    print(i)