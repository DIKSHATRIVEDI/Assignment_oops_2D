/*3.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/

import java.util.*;
class discount
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        double cost;
        System.out.println("Enter Quantity ");
         int qty = sc.nextInt();
        cost = 100 * qty;
                if (qty > 1000)
                {
                    cost = cost -( cost * 0.1);

                }
                System.out.println("Total Amount: "+cost);
    }
}

