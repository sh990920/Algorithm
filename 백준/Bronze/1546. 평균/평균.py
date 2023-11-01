a = int(input())
list_b = list(map(int, input().split()))
list_b.sort()
total = 0
for i in range(len(list_b)):
    list_b[i] = (list_b[i] / list_b[-1]) * 100
    total = total + list_b[i]
print(total / a)