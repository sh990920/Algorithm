a, b = map(int, input().split())
list_a = list(map(int, input().split()))
list_b = list(map(int, input().split()))
res_set = set(list_a + list_b)
c = len(res_set)

print((a + b) - (((a + b) - c) * 2))