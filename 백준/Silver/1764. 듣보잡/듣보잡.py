import sys
input = sys.stdin.readline

n, m = map(int, input().split())

res_dict = {}
res_list = []
for i in range(n + m):
    word = input().rstrip()
    if(res_dict.get(word)):
        res_list.append(word)
    else:
        res_dict[word] = 1

print(len(res_list))
res_list.sort()
for i in res_list:
    print(i)