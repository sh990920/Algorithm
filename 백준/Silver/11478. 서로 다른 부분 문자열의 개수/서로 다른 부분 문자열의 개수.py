s = input()
s_set = set()
for i in range(len(s)):
    for j in range(len(s) - i):
        word = s[j:j+i+1]
        s_set.add(word)

print(len(s_set))