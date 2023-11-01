a = int(input())
for i in range(0, (2 * a - 1), + 1):
    if(i < a):
        for j in range((a - 1), i, -1):
            print(" ", end="")
        for k in range(0, (i * 2 + 1), +1):
            print("*", end="")
        print()
    else:
        for j in range((a - 1), i, + 1):
            print(" ", end="")
        for k in range((((2 * a - 2) - i) * 2 + 1), 0, -1):
            print("*", end="")
        print()