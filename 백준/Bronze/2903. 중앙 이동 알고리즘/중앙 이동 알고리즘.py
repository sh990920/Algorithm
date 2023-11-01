a = int(input())
res = 2
for i in range(a):
    res = res + (res - 1)
print(res * res)