#include<iostream>
using namespace std;
int main()
{
  int a,b,s=0,c;
  cin>>a;
  for(c=0;s<a;c++){
    cin>>b;
    s=s+b;
  }
  cout<<"The number of turns is "<<c;
}