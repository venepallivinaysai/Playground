#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,i,m=0,w=0;
  cin>>n;
  int *p=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++){
    cin>>p[i];
  }
  for(i=0;i<n;i++){
    if(p[i]%2==0)
      m=m+1;
    else
      w=w+1;
  }
  cout<<w<<"\n";
  cout<<m;
  return 0;
}