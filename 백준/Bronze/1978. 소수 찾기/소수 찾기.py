a = int(input())
numbers = list(map(int, input().split()))
count = 0
for i in numbers:
    c = 0
    if i > 1:
        for j in range(2, i):
            if i % j != 0:
                pass
            else:
                c += 1
                break
        if c == 0:
            count += 1
print(count)