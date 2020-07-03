#include<iostream>
int main()
{
    int fp,fd,fs,sp,sd,ss,ap,ad,as;
    int pf,ps,pa;
    int c1,c2,c3;
    std::cin>>fp;
    std::cin>>fd;
    std::cin>>fs;
    std::cin>>sp;
    std::cin>>sd;
    std::cin>>ss;
    std::cin>>ap;
    std::cin>>ad;
    std::cin>>as;
    pf=(fp*fd)/100;
    ps=(sp*sd)/100;
    pa=(ap*ad)/100;
    c1=(fp-pf)+fs;
    c2=(sp-ps)+ss;
    c3=(ap-pa)+as;
    std::cout<<"In Flipkart Rs."<<c1<<"\n";
    std::cout<<"In Snapdeal Rs."<<c2<<"\n";
    std::cout<<"In Amazon Rs."<<c3<<"\n";
    if((c1==c2)&&(c3>c1))
    {
        if(fd>sd)
        {
           std::cout<<"He will prefer Flipkart";
        }
       
    }
  else if((c1<c2)&&(c1<c3))
    {
        std::cout<<"He will prefer Flipkart";
    }
    else if((c2<c1)&&(c2<c3))
    {
        std::cout<<"He will prefer Snapdeal";
    }
    else if((c3<c1)&&(c3<c2))
    {
        std::cout<<"He will prefer Amazon";
    }
   
}   
