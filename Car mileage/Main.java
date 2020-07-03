#include<iostream>
using namespace std;
int main()
{
  float m;
  int l,d;
  cin>>m;
  cin>>l;
  cin>>d;
  m=m*l;
  m=d-m;
  if(m>0){
    cout<<"Cannot reach";
  }
  else
    cout<<"Can reach";
}