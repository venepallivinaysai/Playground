def pri(n):
  if n<=3:
    return 1
  for i in range(2,(n//2)+1):
    if n%i==0:
      return 0
  return 1
def con(a,b):
  if b<10:
    return (a*10)+b
  return (a*100)+b
n=int(input())
l=[]
s=set()
for i in range(2,n+1):
  if pri(i)==1:
    l.append(i)
for i in range(len(l)):
  for j in range(i+1,len(l)):
    if i==j:
      continue
    c1=con(l[i],l[j])
    c2=con(l[j],l[i])
    if pri(c1)==1:
      s.add(c1)
    if pri(c2)==1:
      s.add(c2)
print(len(s))