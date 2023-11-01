list_a = []
count = 0
big_width = 0
for i in range(5):
    input_str = input()
    list_b = []
   
    for j in range(len(input_str)):
        list_b.append(input_str[j])
    
    list_a.append(list_b)

for i in range(len(list_a)):
    if(count < len(list_a[i])):
        count = len(list_a[i])
        big_width = i
new_str = ""
for i in range(len(list_a[big_width])):
    for j in range(len(list_a)):
        try:
            new_str += list_a[j][i]
        except:
            pass
print(new_str)