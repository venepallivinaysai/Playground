#include<iostream>
using namespace std;
int printresult(int,int);
int main()
{
  int n,m,d;
  cin>>n>>m;
  d=printresult(n,m);
  if(d<=m)
    cout<<"YES";
  else
    cout<<"NO";
}
int printresult(int x,int y){
  int i,a[x],sum=0;
  for(i=0;i<x;i++){
    cin>>a[i];
  }
  for(i=0;i<x;i++){
    sum=sum+a[i];
  }
  return sum;
}