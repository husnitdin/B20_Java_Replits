package Replit;

import java.util.Scanner;
public class Vending_Machine {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter price in cents");

            int itemPrice = scan.nextInt();
            int change = 100-itemPrice;

            int quarters = change / 25;
            int quart = change - quarters * 25;

            int dimes = quart / 10;
            int dime = quart - dimes * 10;

            int nickels = dime / 5;
            int nickel = dime - nickels * 5;

            if (itemPrice > 25 || itemPrice < 100) {

                if (itemPrice % 5 ==0) {

                    System.out.println("Your change is "+quarters+" quarters, "
                                                        +dimes+" dimes, "
                                                        +nickels+ " nickels.");
                } else {
                    System.out.println("Invalid price");
                }

            } else {
                System.out.println("Invalid price");
            }

        }
}


