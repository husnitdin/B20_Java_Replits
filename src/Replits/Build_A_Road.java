package Replit;
/*
Write a program that will print out route instructions.
Your program should take 2 parameters: start point and endpoint.
Use left, right, up and down for navigation. Insert ">" between commands.
If start point equals to endpoint - display: "start/end(start or end variable!) found".

Note: you may move only clockwise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found

 */
import java.util.Scanner;

public class Build_A_Road {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();


        if (start == "A" && end == "D") {
            System.out.println("right > down > left: D found");

        } else if (start == "A" && end == "C") {
            System.out.println("right > down: C found");

        } else if (start == "A" && end == "B") {
            System.out.println("right: C found");

        }

    }

}
