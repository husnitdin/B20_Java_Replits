package Replit;

import java.util.Scanner;
/* a sign function is simple, its gets a number and tells you if its positive, negative or zero.
for example :
sign(5)  => 1
sign(-30)=> -1
sign(0)  => 0

sign gets an int parameter.
print out 1,-1 or 0 depending on the input */

public class signum {

    public static void sign(int n) {
        if( n > 0 ){
            System.out.println(1);
        } else if ( n < 0 ){
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }//end sign

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        sign(n);
    }
}
