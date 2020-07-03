#include<iostream>
using namespace std;
int main()
{
  string a;
  getline(cin,a);
  int p=a.find("the");
  a.erase(p,4);
  int p1=a.find("the");
  a.erase(p1,4);
  cout<<a;
}