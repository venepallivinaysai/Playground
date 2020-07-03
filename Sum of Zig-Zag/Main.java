#include<iostream>
using namespace std;
int main()
{
    int m,n,r1=0,r2=0,d=0;
    cin>>m>>n;
    int i,j;
    int a[m][n];
    for(i=0;i<m;i++){
      for(j=0;j<n;j++)
          cin>>a[i][j];
    }
    for(i=0;i<=0;i++){
      for(j=0;j<n-1;j++)
        r1=r1+a[i][j];
    }
    for(i=m-1;i<=m-1;i++){
      for(j=1;j<n;j++)
        r2=r2+a[i][j];
    }
  for(i=0;i<m;i++){
    for(j=n-1;j>=0;j--){
      if((i+j)==(m-1))
        d=d+a[i][j];
    }
  }
 cout<<"Sum of Zig-Zag pattern is "<< d+r1+r2 ;
}