#include<iostream>
using namespace std;
int main()
{
  int a;
  float b,x;
  cin>>a>>b;
  if(a==1)
    cout<<b;
  else if(a==2){
    x=(b*50)/100;
    cout<<b+x;
  }
  else if(a==3){
    x=b+b;
    cout<<x;
  }
  else
    cout<<"Number of items is more";
}