n=int(input())
f=int((n-4)/5)
if((n-f*5)%2==0):
  o=2
else:
  o=1
t=int((n-f*5-o)/2)
print(f+o+t,f,t,o)