/*Write a java program to find following using conditional operator and
without using looping and decision making ?
a) Sum of all even digits of any 4 digit number
b) Sum of all odd digits of any 4 digit number
c) Difference between average of all even digits except divisible by 4 and
avearge of all odd digits except divisble by 3 of any 4 digit number
d) Sum of product of consecutive even digits of any 4 digit number? Supoose
num=1624 then output= 4*2+2*6
e) Sum of product of consecutive odd digits of any 4 digit number? Supoose
num=1356 then output= 5*3+ 3*1
f) Difference between Sum of product of consecutive even digits except 2
and 6 and Sum of product of consecutive odd digits except 3 and 7 of any 4 digit
number
g) Write a java program to find sum of product of corresponding even digits of
first any digit number and corresponding odd digit of any 4 digit number Such as
n=1234 m=4567 output=4*7+2*5*/


import java.util.*;
class A6
{
  public static void main(String arg[])
{
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a 4 digit number");
  int n,m,r,ch,sum=0;
  n=sc.nextInt();


  /*a) Sum of all even digits of any 4 digit number*/
  
  m=n;
  r=m%10;
  ch=r%2==0?r:0;
  sum=sum+ch;
  m=m/10;

  r=m%10;
  ch=r%2==0?r:0;
  sum=sum+ch;
  m=m/10;

  r=m%10;
  ch=r%2==0?r:0;
  sum=sum+ch;
  m=m/10;


  r=m%10;
  ch=r%2==0?r:0;
  sum=sum+ch;
  
  System.out.println("Sum of all even digits of any 4 digit number");
  System.out.println(sum);

  /*b) Sum of all odd digits of any 4 digit number*/
  int r1,ch1,sum1=0;
  int m1=n;


  r1=m1%10;
  ch1=r1%2==0?0:r1;
  sum1=sum1+ch1;
  m1=m1/10;

  r1=m1%10;
  ch1=r1%2==0?0:r1;
  sum1=sum1+ch1;
  m1=m1/10;

  r1=m1%10;
  ch1=r1%2==0?0:r1;
  sum1=sum1+ch1;
  m1=m1/10;


  r1=m1%10;
  ch1=r1%2==0?0:r1;
  sum1=sum1+ch1;
  
  System.out.println("Sum of all odd digits of any 4 digit number");
  System.out.println(sum1);

  /*c) Difference between average of all even digits except divisible by 4 and
avearge of all odd digits except divisble by 3 of any 4 digit number*/
 
    int m2,ch2,ch3,rem,sum2=0,avg,avg1,dif=0;

     m2=n;
     rem=m2%10;
     ch2=rem%2==0?rem:0;
     ch3=rem%4==0?0:rem;
     sum2=sum2+ch3;
     m2=m2/10;

     rem=m2%10;
     ch2=rem%2==0?rem:0;
     ch3=rem%4==0?0:rem;
     sum2=sum2+ch3;
     m2=m2/10;

     rem=m2%10;
     ch2=rem%2==0?rem:0;
     ch3=rem%4==0?0:rem;
     sum2=sum2+ch3;
     m2=m2/10;


     rem=m2%10;
     ch2=rem%2==0?rem:0;
     ch3=rem%4==0?0:rem;
     sum2=sum2+ch3;
    
     avg=sum2/4;

     int m3,sum3=0;
     m3=n;
     rem=m3%10;
     ch2=rem%2==0?0:rem;
     ch3=rem%3==0?0:rem;
     sum3=sum3+ch3;
     m3=m3/10;

     rem=m3%10;
     ch2=rem%2==0?0:rem;
     ch3=rem%3==0?0:rem;
     sum3=sum3+ch3;
     m3=m3/10;
 
     rem=m3%10;
     ch2=rem%2==0?0:rem;
     ch3=rem%3==0?0:rem;
     sum3=sum3+ch3;
     m3=m3/10;
 
     rem=m3%10;
     ch2=rem%2==0?0:rem;
     ch3=rem%3==0?0:rem;
     sum3=sum3+ch3;

     avg1=sum3/4;
      
     dif=avg-avg1;

System.out.println("Difference between average of even digits and avearge of all odd digits is");
      System.out.println(dif);



    /*d) Sum of product of consecutive even digits of any 4 digit number? Supoose
      num=1624 then output= 4*2+2*6*/
     System.out.println("Enter the consecutive even digit to get there sum of product");
    int en=sc.nextInt();
    int p=en;
    int x=0;
    int psum=0;
    int ch4,rem4;
  
    rem4=p%10;
    ch4=rem4%2==0?rem4:0;
    psum = (ch4*x)+psum;
    x=ch4;
    p=p/10;

    rem4=p%10;
    ch4=rem4%2==0?rem4:0;
    psum = (ch4*x)+psum;
    x=ch4;
    p=p/10;

    rem4=p%10;
    ch4=rem4%2==0?rem4:0;
    psum = (ch4*x)+psum;
    x=ch4;
    p=p/10;

    rem4=p%10;
    ch4=rem4%2==0?rem4:0;
    psum = (ch4*x)+psum;
    
    System.out.println("Sum of product of consecutive even digits of any 4 digit number");
    System.out.println(psum);
 
    /*e) Sum of product of consecutive odd digits of any 4 digit number? Supoose
num=1356 then output= 5*3+ 3*1*/
     System.out.println("Enter a odd digit 4 number to find its sum of product");
     int op=sc.nextInt();
    int p1=op;
    int y=0;
    int psum1=0;
    int ch5,rem5;
  
    rem5=p1%10;
    ch5=rem5%2==0?0:rem5;
    psum1 = (ch5*y)+psum1;
    y=ch5;
    p1=p1/10;

    rem5=p1%10;
    ch5=rem5%2==0?0:rem5;
    psum1 = (ch5*y)+psum1;
    y=ch5;
    p1=p1/10;

    rem5=p1%10;
    ch5=rem5%2==0?0:rem5;
    psum1 = (ch5*y)+psum1;
    y=ch5;
    p1=p1/10;

    rem5=p1%10;
    ch5=rem5%2==0?0:rem5;
    psum1 = (ch5*y)+psum1;
    


    
    System.out.println("Sum of product of consecutive odd digits of any 4 digit number");
    System.out.println(psum1);
    
 
 


  

}
}


  
  


