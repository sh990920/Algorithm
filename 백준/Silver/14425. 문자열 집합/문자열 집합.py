import sys
input = sys.stdin.readline

# 이진 트리 검색
def binary_search(target, data):
    # data.sort()
    start = 0
    end = len(data) - 1

    while start <= end:
        mid = (start + end) // 2
        mid_value = data[mid]

        if(mid_value == target):
            return 1
        elif(mid_value < target):
            start = mid + 1
        else:
            end = mid - 1
    
    return 0

n, m = map(int, input().split())
s = []
count = 0
for i in range(n):
    s.append(input().rstrip())

s.sort()

for i in range(m):
    word = input().rstrip()
    count += binary_search(word, s)

print(count)