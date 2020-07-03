#include<iostream>
using namespace std;
int gcd(int,int);
int main()
{
  int a,b,c;
  cin>>a>>b;
  c=gcd(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<c;
}
int gcd(int x,int y){
  if(x==y)
    return x;
  else if(x>y)
    return gcd(x-y,y);
  else
    return gcd(x,y-x);
}
  
     