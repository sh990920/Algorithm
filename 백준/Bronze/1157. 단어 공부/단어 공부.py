a = input()
b = a.upper()
dict_c = {}
for i in range(ord("A"), ord("Z") + 1):
    dict_c[chr(i)] = 0

for i in b:
    if(i in dict_c):
        dict_c[i] = dict_c[i] + 1

dict_items = dict_c.items()
dict_big = None
isEquals = False
for i in dict_items:
    if(dict_big == None):
        dict_big = i
    else:
        if(dict_big[1] == i[1]):
            isEquals = True
        if(dict_big[1] < i[1]):
            dict_big = i
            isEquals = False

if(isEquals != True):
    print(dict_big[0])
else:
    print("?")