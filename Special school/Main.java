#include<iostream>
using namespace std;
int main()
{
  string a,b,c;
  getline(cin,a);
  getline(cin,b);
  for(int i=b.length()-1;i>=0;i--)
    c=c.append(1,b[i]);
  if(a==c)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}