//11.Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).


import java.util.Scanner;
class case1
{
	public static void main(String[] args) {
	   System.out.println("Checking for Uppercase character...");
      char val = 'K';
      System.out.println("Character: "+val);
      if (Character.isUpperCase(val)) {
         System.out.println("Character is in Uppercase");
      }else {
         System.out.println("Character is in Lowercase");
      }
    	   }}

