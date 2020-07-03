#include<iostream>
using namespace std;
int main()
{
  int r,c,max,i,j;
  int a[100][100];
  cin>>r>>c;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++)
      cin>>a[i][j];
  }
  max=a[0][0];
   for(int i=0;i<r;i++){ 
     for(int j=0;j<c;j++){
       if(a[i][j]>max)
         max=a[i][j];
     }
   }
  cout <<"The maximum element is "<<max;
}
