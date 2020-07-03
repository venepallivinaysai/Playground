#include<iostream>
int main()
{
  int a,b,c,d=0,e;
  std::cin>>a;
  std::cin>>b;
  c=a+b;
  for(int i=1;i<c;i++)
  {
    if(c%i==0)
    {
      d=d+i;
    }
  }
if(d==c)
{
  std::cout<<"They can read the message";
}
  else
  {
    std::cout<<"They can't read the message";
  }
}
