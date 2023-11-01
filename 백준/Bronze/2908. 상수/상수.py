a, b = map(str, input().split())
new_a = ''
new_b = ''
for i in range(len(a) - 1, -1, -1):
    new_a = new_a + a[i]
    new_b = new_b + b[i]

if(int(new_a) > int(new_b)):
    print(int(new_a))
else:
    print(int(new_b))