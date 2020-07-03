#include<iostream>
using namespace std;
int main(){
  int x,a,b,c,d,r,i;
  cin>>x>>a>>b>>c>>d;
  if(1<=x&&x<=3){
    switch(x)
    {
      case 1:
        a=a+c;
        b=b+d;
        cout<<a<<b<<"i";
        break;
      case 2:
        a=a-c;
        b=b-d;
        cout<<a<<"+"<<b<<"i";
        break;
      case 3:
        r=(a*c)-(b*d);
        i=(a*d)+(b*d);
        cout<<r<<i<<"i";
        break;
    }
  }
  else
      cout<<"Invalid choice";
}
        
        
        