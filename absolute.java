/*7.
Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/

import java.util.*;
class absolute
{
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n=sc.nextInt(); 
        if (n>= 0)
           System.out.println(n);
        else 
           System.out.println(n*-1);

        
    }
}

