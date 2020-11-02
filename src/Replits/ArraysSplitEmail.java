package Replit;
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */
public class ArraysSplitEmail {
    public static void main(String[] args) {

        String email = "in@fo@cybertekschool.com";

        String[] em = email.split("@");
        int count = 0;
        for (int i = 0; i < em.length-1; i++) {
            if (email.contains("@")){
                count++;
            }
        }

        if(count == 1){
            System.out.println("Email id: "+em[0]);
            System.out.println("Email domain: "+em[1]);
        } else {
            System.out.println("invalid email");
        }
    }
}
