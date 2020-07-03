#include <iostream>
using namespace std;
int main()
{
   int n,a=1,b=1,c;
   c=a;
   cin>>n;
   for(int i=1;i<=n;i++)
   {
     c=a-1;
       for(int j=1;j<=a;j++)
       {
           if(j%2==0)
           cout<<"*";
           else
           {
               if(i%2==0)
               {
              cout<<c+b-a+i;
               b++;
               c=c-2;
               }
             else
             cout<<b++;
           }
       }
       a=a+2;
       cout<<"\n";
   }
   return 0;
}