#include<iostream>
using namespace std;
int fun(int &,int &);
int main(){
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  fun(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}
int fun(int &x,int &y){
  int t;
  t=x;
  x=y;
  y=t;
}