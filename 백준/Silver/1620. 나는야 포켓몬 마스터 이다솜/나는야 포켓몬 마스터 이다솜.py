import sys
input = sys.stdin.readline

c, q_c = map(int, input().split())

poketmon_dict = {}
for i in range(c):
    input_poketmon = input().rstrip()
    poketmon_dict[i + 1] = input_poketmon
    poketmon_dict[input_poketmon] = (i + 1)

for i in range(q_c):
    q = input().rstrip()
    if (q.isdigit()):
        q_num = int(q)
        print(poketmon_dict.get(q_num))
    else:
        poketmon = q
        print(poketmon_dict.get(poketmon))