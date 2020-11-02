package Replit;
/*
Write a program that will print out information about user based on email.
Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
import java.util.Scanner;
public class email2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String fName = email.substring(1, email.indexOf("_"));
        System.out.println("First name: "+ email.substring(0, 1).toUpperCase() +fName);

        String lName = email.substring(email.indexOf("_")+2, email.indexOf("@"));
        System.out.println("Last name: "+ email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() + lName);

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("Domain: "+ domain);

        String topLevelDomain = email.substring(email.indexOf(".")+1);
        System.out.println("Top-Level Domain: "+ topLevelDomain);
    }
}
