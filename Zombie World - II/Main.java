b,n=map(int,input().split())
a=list(map(int,input().split()))
a.sort()
for i in range(n):
  b=b-(a[i]%2)-(a[i]//2)
if(b>0):
  print("YES")
else:
  print("NO")