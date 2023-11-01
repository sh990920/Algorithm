c = int(input())
min_x = 0
max_x = 0
min_y = 0
max_y = 0
if(c == 1):
    a, b = map(int, input().split())
    print(0)
else:
    for i in range(c):
        input_x, input_y = map(int, input().split())
        if(i == 0):
            min_x = input_x
            max_x = input_x
            min_y = input_y
            max_y = input_y
        else:
            if(min_x > input_x):
                min_x = input_x
            if(max_x < input_x):
                max_x = input_x
            if(min_y > input_y):
                min_y = input_y
            if(max_y < input_y):
                max_y = input_y

    print((max_x - min_x) * (max_y - min_y))