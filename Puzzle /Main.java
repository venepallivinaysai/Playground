#include<iostream>
using namespace std;
int main()
{
    int r,c;
  cin>>r>>c;
  int m[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>m[i][j];
    }
  }
   for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      cout<<m[j][i]<<" ";
    }
     cout<<"\n";
   }
  }