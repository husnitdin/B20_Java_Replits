package Replit;
/*
Given an array nums, calculate count of even numbers in nums
(not their values!) and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */
public class CountOfEvenNums {
    public static void main(String[] args) {

        int [] nums = {2, 1, 2, 3, 4};

        int count = 0;
        for (int each: nums) {
            if (each % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
