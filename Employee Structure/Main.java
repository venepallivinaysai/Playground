#include<iostream>
using namespace std;
struct emp{
  char n[50];
  int i;
  int a;
  char d[50];
  double s;
}e;
int main()
{
  cout<<"Enter name:";
  cout<<"\nEnter ID:";
  cout<<"\nEnter age:";
  cout<<"\nEnter designation:";
  cout<<"\nEnter Salary:";
  cout<<"\nEmployee Details";
  cin>>e.n;
  cin>>e.i;
  cin>>e.a;
  cin>>e.d;
  cin>>e.s;
  cout<<"\nName of the Employee : "<<e.n;
  cout<<"\nID of the Employee : "<<e.i;
  cout<<"\nAge of the Employee : "<<e.a;
  cout<<"\nDesignation of the Employee : "<<e.d;
  cout<<"\nSalary of the Employee : "<<e.s;
}