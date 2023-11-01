a = list(input())
list_b = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
count = 0
for i in range(len(a)):
    if(i + 2 < len(a)):
        c = a[i] + a[i + 1] + a[i + 2]
        if list_b[2] == c:
            count += 1
            a[i] = '0'
            a[i + 1] = '0'
            a[i + 2] = '0'
            continue
    if(i + 1 < len(a)):
        c = a[i] + a[i + 1]
        for j in list_b:
            if j == c:
                count += 1
                a[i] = '0'
                a[i + 1] = '0'
                break
for i in range(len(a)):
    if(a[i] != '0'):
        count += 1

print(count)