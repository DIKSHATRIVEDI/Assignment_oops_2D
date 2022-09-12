/*2.Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/

import java.util.Scanner;
 class fm
{
	public static void main(String[] args) {
	    int age;
	    int sex;
	    int married;
	   Scanner sc=new Scanner(System.in);
	   age=sc.nextInt();
	   System.out.println("Enter sex: M/F");
		 sex = sc.next().charAt(0);
		
		System.out.println("Are you married? Y/N");
		 married = sc.next().charAt(0);
	   
	   if(sex=='f'){
	       System.out.print("will work in urban area only!!!!");
	   }
	   if(sex=='m'){
	       
	   
	   if(age>=20||age<=40){
	       System.out.print("he can work anywhere");
	   }
	   else if(age>=40||age<=60){
	       System.out.print("he can work in urban area");
	   }
	   else{
	       System.out.println("ERROR");
	   }
	   }
		
		
	}
}