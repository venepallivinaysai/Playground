#include<iostream>
using namespace std;
int main()
{
  int p,r,y,a,b;
  float c,d;
  cin>>p;
  cin>>r;
  cin>>y;
  a=(p*r*y)/100;
  b=p+a;
  c=float((a*2))/100;
  d=b-c;
  cout<<a<<"\n";
  cout<<b<<"\n";
  cout<<c<<"\n";
  cout<<d;
}