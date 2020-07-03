#include<iostream>
using namespace std;
int main()
{
  int a,b,c,t,i,x;
  cin>>a>>b>>c;
  if(a<b&&a>c||a<c&&a>b)
     cout<<"The treasure is in box which has number "<<a;
  if(b<a&&b>c||b<c&&b>a)
     cout<<"The treasure is in box which has number "<<b;
  if(c<b&&c>a||c<a&&c>b)
     cout<<"The treasure is in box which has number "<<c;
  if(a<b&&a<c)
    t=a;
  if(b<a&&b<c)
    t=b;
  if(c<a&&c<b)
    t=c;
  for( int i = t; i>0; i--){
    if(a%i == 0 && b%i == 0 && c%i == 0){
      x= i;
      break;
    }
  }
  cout<<"\nThe code to open the box is "<<x;
}