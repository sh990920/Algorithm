a = int(input())
while True:
    for i in range(2, a + 1):
        if a % i == 0:
            print(i)
            a //= i
            break
    if(a == 1):
        break