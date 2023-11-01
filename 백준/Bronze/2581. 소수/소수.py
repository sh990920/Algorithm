a = int(input())
b = int(input())

sum = 0
min = b
for i in range(a, b+1):
    if i > 1:
        c = True
        for j in range(2, i):
            if i % j != 0:
                pass
            else:
                c = False
                break
        if c == True:
            sum += i
            if min > i:
                min = i
if sum == 0:
    print(-1)
else:
    print(sum)
    print(min)