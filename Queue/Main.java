#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b,i,sum=0,c=0;
  cin>>a>>b;
  int ar[a];
  for(i=0;i<a;i++)
    cin>>ar[i];
  for(i=0;i<a;i++){
    sum=sum+ar[i];
    if(sum>=0){
    sum=sum-b;
      c=c+1;
    }
  }
  cout<<c;
}