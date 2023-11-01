
A, B = map(int, input().split())
C = int(input())
if(C >= 60):
    A = A + (C // 60)
    B = B + (C % 60)
else:
    B += C

if(B >= 60):
    A += 1
    B -= 60

if(A >= 24):
    A -= 24

print(A, B)