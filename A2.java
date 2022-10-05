/*Write a java program to find simple interest?*/



import java.util.Scanner;

class A2
{

  public static void main(String arg[])

  {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter Principal");
     int p=sc.nextInt();
     System.out.println("Enter Time"); 
     int t=sc.nextInt();
     System.out.println("Enter Rate");
     int r=sc.nextInt();

     int si=(p*t*r)/100;

      System.out.println("Simple Interest =" + si);
}
}
