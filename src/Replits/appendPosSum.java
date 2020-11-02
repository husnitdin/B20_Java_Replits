package Replit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
The original ArrayList should remain unchanged.
 */
public class appendPosSum {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(4,-6,3,-8,0,4,3));

        System.out.println( appendPosSum(arr) );

    }

    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> nums){

        ArrayList<Integer> newIntArr = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0){
                newIntArr.add(nums.get(i));
            }
        }
        //
        int sum = 0;
        for (int i = 0; i < newIntArr.size(); i++) {
            sum += newIntArr.get(i);
        }
        newIntArr.add(newIntArr.size(), sum);
        return newIntArr;
    }
}
