c = int(input())
person_list = []
for i in range(c):
    age, name = map(str, input().split())
    li = [int(age), i, name]
    person_list.append(li)

person_list.sort()

for i in person_list:
    print(f"%d %s" %(i[0], i[2]))