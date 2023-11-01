def gcd(a, b):
    c = 0
    while(b != 0):
        c = a % b
        a = b
        b = c
    return a

def lcm(a, b):
    return (a * b) // gcd(a, b)

a, b = map(int, input().split())
print(lcm(a, b))