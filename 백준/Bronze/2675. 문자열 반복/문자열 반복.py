a = int(input())
for i in range(a):
    b, c = map(str, input().split())
    newStr = ''
    for j in range(len(c)):
        newStr = newStr + (c[j] * int(b))
    print(newStr)
