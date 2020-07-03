#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  if(a<=200){
    int x=a*0.5/1;
    cout<<"Rs."<<x;
  }
  else if(a<=400){
    cout<<"Rs."<<(a*0.65)+100;
  }
  else if(a<=600){
    cout<<"Rs."<<(a*0.80)+200;
  }
  else
    cout<<"Rs."<<(a*1.25)+425;
}