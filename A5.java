/*Write a java program to find following without using looping and decision
making
I. Sum of all digits of any 4 digit numbers
II. find the face value and position value of any 4 digit number?
III. Find the value available at position required by user it may be 10,
100 or 1000?
IV. Sum of product of consecutive digits of any 4 digit number? Supoose
num=1234 then output= 4*3+3*2+2*1
V. find sum of product of corresponding digits of two any 4 digit
number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1
VI. find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit
number?
VII. Find left shit, right shift and zero fill of summation of all digits of any
4 digit number and it will be shifted by 3rd digit of any 4 digit
number?*/




import java.util.*;

class A5
{
public static void main(String arg[])
{
  Scanner sc = new Scanner(System.in);
  int m,n,dn,rn,sum=0,v=0,t=1,rem;
  System.out.println("Enter any 4 digit no :");
  m=sc.nextInt();
  n=m;

  System.out.println("sum of 4 digit no "+n);
  
  //1.for sum of 4 digit number
  rn=n%10;
  sum=sum+rn;
  n=n/10;

  rn=n%10;
  sum= sum+rn;
  n=n/10;

  rn=n%10;
  sum= sum+rn;
  n=n/10;

  rn=n%10;
  sum=sum+rn;

  System.out.println(sum);

  //2.find the face value and position value of any 4 digit number
  dn=m;
  rem= dn%10;
  dn=dn/10;
  v=t*rem;
  System.out.println("face  position value");
  System.out.println(" "+rem+"    "+v);

  rem=dn%10;
  dn=dn/10;
  t=t*10;
  v=t*rem;
  System.out.println(" "+rem+"    "+v);

  rem=dn%10;
  dn=dn/10;
  t=t*10;
  v=t*rem;
  System.out.println(" "+rem+"    "+v);

  rem=dn%10;
  dn=dn/10;
  t=t*10;
  v=t*rem;
  System.out.println(" "+rem+"    "+v);

  /*III. Find the value available at position required by user it may be 10,
100 or 1000?*/

   System.out.println("Enter the position 10 100 1000");
   int pv=sc.nextInt();
   int pn=m;
   int prem=pn%pv;
   System.out.println("Value at position "+pv);
   System.out.println(prem);

/*IV. Sum of product of consecutive digits of any 4 digit number? Supoose
num=1234 then output= 4*3+3*2+2*1*/
   int c=m,cr;
   int mul=0;
   int csum=0;

   cr=c%10;
   csum=csum+(mul*cr);
   mul=cr;
   c=c/10;

   cr=c%10;
   csum=csum+(mul*cr);
   mul=cr;
   c=c/10;
    
   cr=c%10;
   csum=csum+(mul*cr);
   mul=cr;
   c=c/10;

   cr=c%10;
   csum=csum+(mul*cr);

   System.out.println("Sum of product of consecutive digits of 4 digit number");
   System.out.println(csum);


   /*V. find sum of product of corresponding digits of two any 4 digit
number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1*/



    System.out.println("Enter any two 4 digit no :");
    System.out.println("Enter 1st 4 digit no :");
    int f=sc.nextInt();

    System.out.println("Enter 2nd 4 digit no :");
    int s=sc.nextInt();

     


    int fr,sr,pr,spr=0;
    fr=f%10;
    sr=s%10;
    pr=fr*sr;
    spr=spr+pr;
    f=f/10;
    s=s/10;


    fr=f%10;
    sr=s%10;
    pr=fr*sr;
    spr=spr+pr;
    f=f/10;
    s=s/10;



    fr=f%10;
    sr=s%10;
    pr=fr*sr;
    spr=spr+pr;
    f=f/10;
    s=s/10;



    fr=f%10;
    sr=s%10;
    pr=fr*sr;
    spr=spr+pr;


    System.out.println("Sum of product of Two 4 digit number");
    System.out.println(spr);
    




  }

}




  

   

  

  









