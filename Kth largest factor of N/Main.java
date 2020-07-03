import math
n,k=list(map(int,input().split()))
l=[]
for i in range(1,int(math.sqrt(n))+1):
	if n%i==0:
		l.append(i)
		if n/i!=i:
			l.append(int(n/i))
l.sort()
if k>len(l):		
  print("1")
else:
  print(l[-k])