#include<iostream>
#include<math.h>
#include<cmath>
using namespace std;
int main()
{
  int a,x,c;
  float b;
  cin>>a;
  b=1/sqrt(a);
  x=b*a;
  if(x>(a*b))
    x=x+(x/(a*b));
  cout<<a+x+1;
}