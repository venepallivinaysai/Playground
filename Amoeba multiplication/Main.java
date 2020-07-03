#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,c=0,i=0;
  cin>>n;
  while(i<n){
    c=a;
    a=b;
    b=c+a;
    i+=1;
  }
  cout<<c;
}