#include<iostream>
using namespace std;
int main()
{
  int a,b,x;
  cin>>a>>b;
  if(a>b){
    x=100-a;
    cout<<x+b;
  }
  else{
    cout<<b-a;
  }
}