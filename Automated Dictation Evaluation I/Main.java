#include<iostream>
using namespace std;
int main()
{
  string a,b;
  getline(cin,a);
  getline(cin,b);
  if(a==b)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}