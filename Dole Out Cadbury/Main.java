def co(i,j):
  c=0
  if i<j:
    i,j=j,i
  if i==j:
    c=c+1
    return c
  while( i>j ):
    i=i-j
    c=c+1
    if(i<j):
      i,j=j,i
    if(i==j):
      c=c+1
      return c
    if i==1:
      c=c+(i*j)
p=int(input())
q=int(input())
r=int(input())
s=int(input())
su=0
if 0<p<q and 0<q<=1501 and 0<r<s and 0<s<=1501 :
  for i in range(p,q+1):
    for j in range(r,s+1):
      su=su+co(i,j)
print(su)      