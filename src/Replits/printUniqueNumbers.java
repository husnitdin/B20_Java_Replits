package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.
Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */
public class printUniqueNumbers {
    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        for (int each: nums ){
            int count = 0;
            for (int item: nums){
                if (each == item){
                    count++;
                }
            }

            if (count == 1){
                System.out.println(each);
            }
        }
    }
}
