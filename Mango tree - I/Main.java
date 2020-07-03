#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(c<=(a*b)){
    if(c<b||c%b==1)
      cout<<"Yes";
    else
      cout<<"No";
  }
  else
     cout<<"No";
}