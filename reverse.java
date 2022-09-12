
/*3.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895*/

import java.util.Scanner;
class reverse
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a no u want to reverse");
	    n=sc.nextInt();
		int rev=0;
		int rem;
		//int n=1234;
		while(n>0){
		    rem=n%10;
		    rev=rev*10+rem;
		    n=n/10;
		}
		System.out.println("no is reversed");
		System.out.println(rev);
		
		
		
	}
}