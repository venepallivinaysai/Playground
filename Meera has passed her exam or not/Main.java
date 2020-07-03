#include<iostream>
using namespace std;
int main()
{
  int n,i=0,c=0;
  cin>>n;
  int s[n];
  for(int i=0;i<n;i++)
  {
    cin>>s[i];
  }
   int m;
  cin>>m;
  for(int i=0;i<n;i++)
  {
    if(s[i]==m)
    {
      c=1;
       break;
    }
  }
  if(c==0)
  {
     cout<<"She failed";
  }
  else
  {
     cout<<"She passed her exam";
  }
}