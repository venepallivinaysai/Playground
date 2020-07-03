#include<iostream>
using namespace std;
int main()
{
   int sumr=0,sumc=0,countr=0,countc=0;
   int ar[100],ac[100];
  int r,c,a[100][100];
  cin>>r>>c;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int m=0;
  cout<<"Sum of rows is ";
   for(int i=0;i<r;i++)
   {
        sumr=0;
      for(int j=0;j<c;j++)
      {
         sumr=sumr+a[i][j];
      }
     cout<<sumr<<" ";
     ar[m++]=sumr;
   }
  cout<<"\n";
  int cr=ar[0];
  for(int i=0;i<r;i++)
  {
      if(cr<ar[i])
      {
          cr=ar[i];
          countr=i;
      }
  }
  cout<<"Row "<<countr+1<<" has maximum sum"<<"\n";
  int k=0;
  cout << "Sum of columns is ";
   for(int i=0;i<c;i++)
   {
       sumc=0;
      for(int j=0;j<r;j++)
      {
         sumc=sumc+a[j][i];
      }
      cout<<sumc<<" ";
     ac[k++]=sumc;
     
   }
   cout<<"\n";
  int cc=ac[0];
  for(int i=0;i<c;i++)
  {
      if(cc<ac[i])
      {
          cc=ac[i];
          countc=i;
      }
  }
  cout<<"Column "<<countc+1<<" has maximum sum"<<"\n";
}