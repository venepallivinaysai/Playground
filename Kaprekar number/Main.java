#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,x,c=0,t,m,y;
  double a,b;
  cin>>n;
  x=n;
  while(n>0){
    if(n%10>=0){
      c=c+1;
      n=n/10;
    }
  }
  m=x*x;
  y=(pow(10,c));
  a=m%y;
  b=m/y;
  t=a+b;
  if(t==x)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}