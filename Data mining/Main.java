#include<iostream>
using namespace std;
int main()
{
  int n,t,e=0,o=0;
  cin>>n;
  while(n>0){
    t=n%10;
    if(t%2==0){
      e=e+t;
      n=n/10;
    }
    else{
      o=o+t;
      n=n/10;
    }
  }
  if(e==o){
    cout<<"Yes";
  }
  else
    cout<<"No";
}