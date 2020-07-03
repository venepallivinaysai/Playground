#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,x;
  cin>>a>>b>>c>>d;
  a=a+c;
  b=b+d;
  if(b>100){
    x=b/100;
    a=a+x;
    b=b%100;
    cout<<a<<"\n";
    cout<<b;
  }
  else{
    cout<<a<<"\n";
    cout<<b;
  }
}