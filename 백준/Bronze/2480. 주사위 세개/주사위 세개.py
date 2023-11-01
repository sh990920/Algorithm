a, b, c = map(int, input().split())
if a == b == c:
    print(10000 + (a * 1000))
else:
    if a == b != c:
        print(1000 + (a * 100))
    elif a == c != b:
        print(1000 + (a * 100))
    elif b == c != a:
        print(1000 + (b * 100))
    else:
        if a > b and a > c:
            print(a * 100)
        elif b > c:
            print(b * 100)
        else:
            print(c * 100)