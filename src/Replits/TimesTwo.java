package Replit;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
 */
public class TimesTwo {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4));

        timesTwo(nums);

    }

   public static void timesTwo(ArrayList<Integer>nums){
        int count = 0;
                for (Integer each: nums) {
                   nums.set(count, (nums.get(count)*2 ) );
                    count++;
                }
                System.out.println( nums );
    }
}
