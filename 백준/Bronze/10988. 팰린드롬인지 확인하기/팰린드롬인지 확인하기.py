a = input()
b = ''
for i in range(len(a) - 1, -1, -1):
    b += a[i]

if(a == b):
    print(1)
else:
    print(0)