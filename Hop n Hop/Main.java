#include<iostream>
#include<math.h>
#include<cmath>
using namespace std;
int main()
{
  int x,y,a,b,d;
  cin>>x;
  cin>>y;
  a=abs(x-3);
  b=abs(y-4);
  d=abs((a*a)+(b*b));
  d=sqrt(d);
  cout<<d;
}