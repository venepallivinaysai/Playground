#include<iostream>
int main()
{
    int a,b,c,d,e,f,g,l,m;
    int s;
    int p,q,r,t,u,v,w;
    std::cin>>a;
    if(a>0)
    {
        l=a*100;
        p=(l*50)/100;
        a=l+p;
    }
    std::cin>>b;
    if(b<=8)
    {
        b=b*100;
    }
    else if(b>8)
    {
       q=b-8;
       b=800+q*100+q*15;
    }
    std::cin>>c;
    if(c<=8)
    {
        c=c*100;
    }
    else if(c>8)
    {
       r=c-8;
       c=800+r*100+r*15;
    }
    std::cin>>d;
    if(d<=8)
    {
        d=d*100;
    }
    else if(d>8)
    {
       s=d-8;
       d=800+s*100+s*15;
    }
    std::cin>>e;
    if(e<=8)
    {
        e=e*100;
    }
    else if(e>8)
    {
       t=e-8;
       e=800+t*100+t*15;
    }
    std::cin>>f;
    if(f<=8)
    {
        f=f*100;
    }
    else if(f>8)
    {
       u=f-8;
       f=800+u*100+u*15;
    }
    std::cin>>g;
    if(g>0)
    {
        m=g*100;
        v=(m*25)/100;
        g=m+v;
    }
    s=a+b+c+d+e+f+g;
    std::cout<<s;
   
}
