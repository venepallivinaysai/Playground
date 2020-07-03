#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,t,x;
  cin>>n;
  x=n;
  while(n!=0){
    t=n%10;
    sum=sum+t;
    n=n/10;
  }
  if(x%sum!=0){
    cout<<"Not Harshad Number";}
  else
    cout<<"Harshad Number";
}