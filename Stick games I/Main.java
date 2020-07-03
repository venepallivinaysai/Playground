#include<iostream>
using namespace std;
void print(int);
int main()
{
  int a,b;
  cin>>a>>b;
  if(a<b)
    print(a);
  else
    print(b);
}
void print(int x){
  if(x%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
