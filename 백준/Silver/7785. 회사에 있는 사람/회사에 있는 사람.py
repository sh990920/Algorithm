import sys
input = sys.stdin.readline

c = int(input().rstrip())
person_dict = {}

for i in range(c):
    key, value = map(str, input().split())
    person_dict[key] = value

sorted_dict = dict(sorted(person_dict.items(), reverse=True))

for key, value in sorted_dict.items():
    if(value == "enter"):
        print(key)