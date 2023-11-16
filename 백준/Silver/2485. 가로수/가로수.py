import math

roop = int(input())

mini = int(input())

interval = []

for i in range(roop - 1):
    num = int(input())
    interval.append(num - mini)
    mini = num

g = interval[0]

for i in range(1, len(interval)):
    g = math.gcd(g, interval[i])

result = 0
for i in interval:
    result += i // g - 1

print(result)