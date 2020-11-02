package Replit;

import java.util.Scanner;

/*
Given method called cube. Write all required code inside this method in order
to asks the user for a number and then prints the cubed value of that number:

Example:
input: 5
output: 125
hint: cube of a number n = n*n*n
 */
public class Methods_FindCube {

    public static int cube(int num) {
        num = num * num * num;
        return num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        System.out.println(cube(in));
    }
}
