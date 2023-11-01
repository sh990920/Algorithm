x, y, w, h = map(int, input().split())
# 0, 0, w, h
if(x - 0 >= w - x):
    if(y - 0 >= h - y):
        if(h - y > w - x):
            print(w - x)
        else:
            print(h - y)
    else:
        if(y - 0 > w - x):
            print(w - x)
        else:
            print(y - 0)
else:
    if(y - 0 >= h - y):
        if(h - y > x - 0):
            print(x - 0)
        else:
            print(h - y)
    else:
        if(y - 0 > x - 0):
            print(x - 0)
        else:
            print(y - 0)