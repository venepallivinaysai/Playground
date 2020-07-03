#include<iostream>
using namespace std;
int main()
{
 int n,l,v;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>l;
  if(l>n)
  {
    cout<<"Invalid Input";
  }
  else
  {
  cout<<"Enter the value to insert"<<"\n";
  cin>>v;
  for(int i=n;i>l-1;i--)
  {
    a[i]=a[i-1];
  }
  a[l-1]=v;
  cout<<"Array after insertion is"<<"\n";
  for(int i=0;i<n+1;i++)
  {
    cout<<a[i];
    cout<<"\n";
  }
  }
}
