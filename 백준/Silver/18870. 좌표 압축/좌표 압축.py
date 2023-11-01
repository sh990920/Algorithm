import sys
input = sys.stdin.readline
c = int(input())
num_list = list(map(int, input().split()))
num_set_list = sorted(list(set(num_list)))

num_set_dict = {}

for i in range(len(num_set_list)):
    num_set_dict[num_set_list[i]] = i

for i in num_list:
    print(num_set_dict[i], end=" ")