t = int(input())
c_list = []
for i in range(t):
    c_list.append(int(input()))

for i in c_list:
    res = i
    q_c = res // 25
    res = res % 25
    
    d_c = res // 10
    res %= 10

    n_c = res // 5
    res %= 5

    p_c = res // 1
    res %= 1
    print('%d %d %d %d' %(q_c, d_c, n_c, p_c))
