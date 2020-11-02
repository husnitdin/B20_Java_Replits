package Replit;

import java.util.Arrays;

/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.

Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */
public class uniqNum {

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 4, 5, 4, 6, 6};

        for (int item : nums) {
            int count = 0;

            for (int each : nums){
                if (item == each){
                    count++;
                }
            }
            if (count==1){
                System.out.print (item+" ");
            }
        }
    }
}
