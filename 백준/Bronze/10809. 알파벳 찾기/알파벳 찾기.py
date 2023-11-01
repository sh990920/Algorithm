a = input()
dic_b = {}
for i in range(ord('a'), ord('z') + 1):
    dic_b[chr(i)] = -1
for i in range(len(a)):
    if(a[i] in dic_b):
        if(dic_b[a[i]] == -1):
            dic_b[a[i]] = i

list_c = list(dic_b.values())
for i in list_c:
    print(i, end=" ")