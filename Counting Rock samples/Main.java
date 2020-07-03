s,r=map(int,input().split())
l=list(map(int,input().split()))
l.sort()
for i in range(r):
  c=0
  mi,ma=map(int,input().split())
  for i in range(len(l)):
    if l[i]>=mi and l[i]<=ma:
      c=c+1
    if l[i]>ma:
      break
  print(c,end=" ")