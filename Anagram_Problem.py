a = input()
b = input()
hit = False;
n = len(a)+len(b)
for i in range(0,len(a)):
    for j in range(0,len(b)):
        if(a[i]==b[j]):
            hit = True
            n-=1
if hit:
    n -= 1
print(n)

