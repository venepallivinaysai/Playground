def av(l,l1):
  for i in range(len(l1)):
    if(ord(l1[i])-96!=l.count(l1[i])):
      return False
  return True
t=int(input())
for i in range(t):
  l=list(input())
  l1=l
  l1=list(set(l1))
  if av(l,l1):
    print("YES",end=" ")
  else:
    print("NO",end=" ")