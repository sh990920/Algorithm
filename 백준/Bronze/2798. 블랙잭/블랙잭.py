from itertools import permutations

N, M = map(int, input().split())
lst = list(map(int, input().split()))
nlst = []

for three in permutations(lst, 3):
    if sum(three) > M:
        continue
    else:
        nlst.append(sum(three))
print(max(nlst))