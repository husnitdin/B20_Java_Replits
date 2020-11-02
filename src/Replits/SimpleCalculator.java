package Replit;
/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */
import java.util.*;
public class SimpleCalculator {

    public static void main(String[] args) {
        plus();
    }

    public static void plus() {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int add2Num = num1+num2;
        System.out.println( add2Num);
    }
}
