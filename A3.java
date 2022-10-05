/*Write a java program for temperature conversion?*/
import java.util.Scanner;

class A3
{

  public static void main(String arg[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter 1 for CELCIUS TO FARENHIT AND 2 FOR FARENHIT TO     CELCIUS ");
      int n = sc.nextInt();
      if(n==1)
      {
         System.out.println("Enter temp in celcius");
         double c= sc.nextDouble();
         double f=(c*9/5)+32;
         System.out.println("CELCIUS TO FARENHIT IS " + f);

       }else if(n==2)
       {
         System.out.println("Enter temp in farenhit");
         double f= sc.nextDouble();
         double c=(f-32)*5/9;
         System.out.println("CELCIUS TO FARENHIT IS " + c);
 
       }else
        {
          System.out.println("Invalid Choice sry!!!");
         }
      }
 }