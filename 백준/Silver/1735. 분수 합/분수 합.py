def gcd(a, b):
    c = 0
    while(b != 0):
        c = a % b
        a = b
        b = c
    return a

def lcm(a, b):
    return (a * b) // gcd(a, b)

u1, d1 = map(int, input().split())
u2, d2 = map(int, input().split())

ru = (u1 * (lcm(d1, d2) // d1)) + (u2 * (lcm(d1, d2) // d2))
rd = lcm(d1, d2)

if(gcd(rd, ru) > 1):
    num = gcd(rd, ru)
    ru = ru // num
    rd = rd // num

print(f"%d %d" %(ru, rd))