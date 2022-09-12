/*4. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
 
 import java.util.*;
 class salary
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int year,sal;	
      double d;
      System.out.println("Enter total Years of services ");
      year=sc.nextInt();
      if(year>5)
      {
	 System.out.println("year of services more than 5 years");
	 System.out.println("Please Enter your salary");
       sal=sc.nextInt();
	 System.out.println("YOUR SALARY IS "+sal);
	 System.out.println("YOUR 5% BONUS  IS "+sal*0.05);
	 System.out.println("YOUR NET BONUS WITH SALARY IS "+(sal+(sal*0.05)));
      }
      else
      {
	 System.out.println("NO BONUS ");
      }
	
  }
}

