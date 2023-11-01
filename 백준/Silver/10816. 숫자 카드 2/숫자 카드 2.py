n = int(input())
n_list = list(map(int, input().split()))
n_dict = {}
m = int(input())
m_list = list(map(int, input().split()))
result = []

for i in range(n):
    if(n_dict.get(n_list[i])):
        n_dict[n_list[i]] = n_dict.get(n_list[i]) + 1
    else:
        n_dict[n_list[i]] = 1

for i in range(m):
    if(n_dict.get(m_list[i])):
        result.append(n_dict.get(m_list[i]))
    else:
        result.append(0)

for i in result:
    print(i, end=" ")