/*8.
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

import java.util.*;
class attendance
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("no of classes held");
 int x=sc.nextInt();
 System.out.println("no of classes attend");
 int y=sc.nextInt();
float pf;
 pf=((y*100)/x);
 System.out.println(pf);
if(pf>=75)
System.out.println("eligible:"+ pf);
else 
System.out.println(" not eligible:"+ pf);
}
}


