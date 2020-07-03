#include<iostream>
using namespace std;
int main()
{
  int n,i,t;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++){
    cin>>a[i];
  }
  for( i=0;i<n;i++){
    if(a[i]>a[i+1]){
      t=a[i];
      a[i+1]=a[i];
      a[i]=t;
    }
  }
  cout<<a[n-1];
}