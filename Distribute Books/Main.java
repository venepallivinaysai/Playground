def fin(n):
    i=3;
    l=[1,0,1]
    while i<=n:
         l.append(((i-1)*(l[i-1] + l[i-2]))%100000007)
         i=i+1
    return l[n]

n=int(input())
print(fin(n))