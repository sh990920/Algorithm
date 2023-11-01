a = int(input())
b = int(input())
c = int(input())

if(a + b + c == 180):
    if(a == b and b == c):
        print("Equilateral")
    else:
        if(a == b or a == c or b == c):
            print("Isosceles")
        else:
            print("Scalene")
else:
    print("Error")