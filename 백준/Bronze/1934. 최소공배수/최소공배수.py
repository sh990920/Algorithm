# 최대 공약수 구하는 함수
def gcd(a, b):
    c = 0
    while(b != 0):
        c = a % b
        a = b
        b = c
    return a

# 최소 공배수 구하기
def lcm(a, b):
    return (a * b) // gcd(a, b)

t = int(input())
for i in range(t):
    a, b = map(int, input().split())
    if(a < b):
        c = a
        a = b
        b = c
    print(lcm(a, b))