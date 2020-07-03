#include<iostream>
using namespace std;
int main()
{
  int r,c,sum=0;
  cin>>r;
  cin>>c;
  int m1[r][c],m2[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>m1[i][j];
    }
  }
   for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>m2[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      sum=m1[i][j]+m2[i][j];
      cout<<sum<<" ";
    }
    cout<<"\n";
  }
}
