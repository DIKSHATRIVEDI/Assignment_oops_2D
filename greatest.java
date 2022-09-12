
//2.Take two int values from user and print greatest among them.
 
 import java.util.*;
 class greatest
 {
   public static void main (String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter 2 no.s ");
     double n1=sc.nextDouble();
     double n2=sc.nextDouble();
     if (n1 == n2)
       System.out.println ("both are equal");
     else if (n1 > n2)
         System.out.println (n1 + " is greater");

     else
         System.out.println (n2 + " is greater");

   }
 }
