#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   student s;
  cout<<"\nStudent Details";
  cin.get(s.name,50);
  cin>>s.roll>>s.marks;
  cout<<"\nName: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
  
}