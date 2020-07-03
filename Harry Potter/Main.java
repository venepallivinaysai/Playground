#include<iostream>
using namespace std;
int main()
{
  int n,l,f,s;
  cin>>n;
  l=n%10;
  f=n/1000;
  s=f+l;
  cout<<s;
}