//6. Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.*;
 class oldestyoungest
 {
    public static void main(String args[]) 
     {
        Scanner sc = new Scanner(System.in);
        int age1, age2, age3, s, g;
        System.out.print("Enter First Age: ");
        age1 = sc.nextInt();
        System.out.print("Enter Second Age: ");
        age2 = sc.nextInt();
        System.out.print("Enter Third Age: ");
        age3 = sc.nextInt();

        if (age1 >= 0 && age2 >= 0 && age3 >= 0) {
            if (age1 > age2) {
                if (age1 > age3) {
                    g = age1;
                } else {
                    g = age3;

                  System.out.println("Greatest: "+g);
                }
                if (age2 < age3) {
                    s = age2;
                } else
                    s = age3;
                System.out.println("Smallest: "+s);
               }
            else if (age2 > age1) {
                if (age2 > age3) {
                    g = age2;
                } else {
                    g = age3;
                }
                System.out.println("Greatest: "+g);
                if (age1 < age3) {
                    s = age1;
                } else
                    s = age3;
                System.out.println("Smallest: "+s);

            }
            else if (age3 > age1) {
                if (age3 > age2) {
                    g = age3;
                } else {
                    g = age2;
                }
                System.out.println("Greatest: "+g);
                if (age3 < age2) {
                    s = age3;
                } else
                    s = age2;
                System.out.println("Smallest: "+s);

            }
            
            if(age1 == age2 && age3!=age1)
            {
                if(age1 > age3)
                    System.out.println("First and Second are Oldest and they are same and Third is Youngest ");
                else
                    System.out.println("First and Second are Youngest and they are same and Third is oldest ");
            }
            else if(age3 == age1 && age2!=age3)
            {
                if(age3 > age2)
                    System.out.println("First and Third are Oldest and they are same and Second is Youngest ");
                else
                    System.out.println("First and Third are Youngest and they are same and Second is oldest ");
            }
            else
                System.out.println("All Are Equal!");


        }
        else
            System.out.println("Incorrect input");


    }
}
