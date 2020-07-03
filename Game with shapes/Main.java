#include<iostream>
using namespace std;
int main()
{
  int r,s,a;
  cin>>r;
  cin>>s;
  a=r+r;
  if(a!=s)
    cout<<"circle cannot be inside a square";
  else
    cout<<"circle can be inside a square";
}