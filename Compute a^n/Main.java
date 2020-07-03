#include<iostream>
using namespace std;
int power(int,int);
int main()
{
  int a,b,c;
  cin>>a>>b;
  cout<<"Enter the value of a\nEnter the value of n\n";
  c=power(a,b);
  cout<<"The value of "<<a<<" power "<<b<<" is "<<c;
}
int power(int x,int y){
  int val;
  if(y>0){
    val=x*power(x,y-1);
  }
  else
    return 1;
}