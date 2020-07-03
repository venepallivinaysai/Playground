#include<iostream>
using namespace std;
int main()
{
  int r,i,j,sum=0,sum1=0;
  cin>>r;
  int a[r][r];
  for(i=0;i<r;i++){
    for(j=0;j<r;j++){
      cin>>a[i][j];
    }
  }
  for (i = 0; i < r; i++) {
   for (j = 0; j <r; j++) {
     if(i==j)
     sum+=a[i][j];
   }
  }
  for (i = 0; i < r; i++) {
   for (j = 0; j <r; j++) {
     if((i+j)==(r-1))
     sum1+=a[i][j];
   }
  }
  if(sum==sum1)
    cout<<"Yes";
  else
    cout<<"No";
}