#include<iostream>
using namespace std;
int main()
{
  int r,c;
  int a[100][100];
  cin>>r>>c;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  }
   for(int i=0;i<r;i++){
     int sum=0;
     for(int j=0;j<c;j++)
       sum=sum+a[i][j];
     cout << sum<<"\n";
    }
}
