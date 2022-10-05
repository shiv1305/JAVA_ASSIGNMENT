/*1. Write a java program to find following using looping and decision making 
without function
I. Sum of all digits of any numbers
II. Sum of all even digits of any number
III. Sum of all odd digits of any number
IV. Sum of all prime digits
V. Difference between average of all even digits except divisible by
4 and average of all odd digits except divisible by 3 
VI. Find kth digit from front side or back side of any digits number 
and find its positional value
VII. Sum of product of consecutive digits of any digit number
VIII. Sum of product of consecutive even digits of any digit number
IX. Sum of product of consecutive odd digits of any digit number
X. Sum of product of consecutive prime digits of any digit number
XI. Difference between Sum of product of consecutive even digits 
except 2 and 6 and Sum of product of consecutive odd digits 
except 3 and 7 of any digit number*/

import java.util.*;

class P1
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    int n,sum=0,esum=0,osum=0;

    /*I. Sum of all digits of any numbers*/

    System.out.println("Enter any number:");
    n=sc.nextInt();
    for(int i=0;i<=n;i++)
    {
      sum=sum+i;
    }
    System.out.println("SUM OF ALL DIGIT TILL "+n+" IS "+sum);
    
    /*II. Sum of all even digits of any number*/
    
    for(int i=0;i<=n;i++)
    {
      if(i%2==0)
       {
         esum=esum+i;
       }
    }
    System.out.println("SUM OF ALL EVEN DIGIT TILL "+n+" IS "+esum);
  
    /*III. Sum of all odd digits of any number*/
    
    for(int i=0;i<=n;i++)
    {
      if(i%2!=0)
       {
         osum=osum+i;
       }
    }
    System.out.println("SUM OF ALL ODD DIGIT TILL "+n+" IS "+osum);

    /*IV. Sum of all prime digits*/
    
    










  }
}
     
    
















    