#include<iostream>
using namespace std;
int cal(int);
int main()
{
  int n,i,d;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  d=cal(n);
}
int cal(int x){
  int i,a[x],e=0,o=0;
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<x;i++)
    cin>>a[i];
  for(i=0;i<x;i++){
    if(a[i]%2==0)
      e=e+1;
    else
      o=o+1;
  }
  if(e>0&&o==0)
    cout<<"The array is Even";
  else if(e==0&&o>0)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}
  