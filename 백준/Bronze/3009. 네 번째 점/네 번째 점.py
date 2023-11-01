list_square = []
x = 1000
y = 1000
w = 0
h = 0
for i in range(3):
    input_x, input_y = map(int, input().split())
    tuple_grid = (input_x, input_y)
    list_square.append(tuple_grid)
    if(x > input_x):
        w = x
        x = input_x
    else:
        if(w == 1000 or w < input_x):
            w = input_x
    if(y > input_y):
        h = y
        y = input_y
    else:
        if(h == 1000 or h < input_y):
            h = input_y
    

count_x = 0
count_y = 0
count_w = 0
count_h = 0

for i in list_square:
    if(i[0] != x):
        count_w += 1
    else:
        count_x += 1
    if(i[1] != y):
        count_h += 1
    else:
        count_y += 1

if(count_x > count_w):
    print(w, end=" ")
else:
    print(x, end=" ")

if(count_y > count_h):
    print(h)
else:
    print(y)