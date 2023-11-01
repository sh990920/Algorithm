import sys
input = sys.stdin.readline
# 이진 트리 검색
def binary_search(target, data):
    # data.sort()
    start = 0
    end = len(data) - 1

    while start <= end:
        mid = (start + end) // 2

        if(data[mid] == target):
            return data[mid]
        elif(data[mid] < target):
            start = mid + 1
        else:
            end = mid - 1
    
    return None


u_c = int(input().rstrip())
u_list = list(map(int, input().split()))
u_list.sort()

c_c = int(input().rstrip())
c_list = list(map(int, input().split()))

for i in range(c_c):
    idx = binary_search(c_list[i], u_list)
    if(idx):
        print(1, end = " ")
    else:
        print(0, end = " ")