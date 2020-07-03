#include<iostream>
using namespace std;
struct college
{
  char n[100];
  char city[100];
  int yr;
  float p;
};
int main()
{
    int k,i,j;
    cin>>k;
    cout<<"Enter the number of colleges";
    college c[k];
    j=1;
    for(i=0;i<k;i++)
    {
        cout<<"\n"<<"Enter the details of college "<<j;
        cin>>c[i].n;
        cout<<"\n"<<"Enter name";
        cin>>c[i].city;
        cout<<"\n"<<"Enter city";
        cin>>c[i].yr;
        cout<<"\n"<<"Enter year of establishment";
        cin>>c[i].p;
        cout<<"\n"<<"Enter pass percentage";
        j++;
}
        cout<<"\n"<<"Details of colleges";
        j=1;
        for(i=0;i<k;i++)
        {  
        cout<<"\n"<<"College:"<<j;
        cout<<"\n"<<"Name:"<<c[i].n;
        cout<<"\n"<<"City:"<<c[i].city;
        cout<<"\n"<<"Year of establishment:"<<c[i].yr;
        cout<<"\n"<<"Pass percentage:"<<c[i].p;
        j++;
        }
        return 0;
  }
