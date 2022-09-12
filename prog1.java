//1.Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.*;

class prog1
{
   public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth: ");
        double b=sc.nextDouble();
        if(l==b)
        System.out.println("Square");
        else
        System.out.println("Not a Square");

     }

}



