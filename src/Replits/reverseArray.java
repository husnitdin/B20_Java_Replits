package Replit;

import java.util.Arrays;

/*
Write the definition of a method reverse, whose parameter is an array of Strings.
The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
 */
public class reverseArray {

    public static void main(String[] args) {
        String [] arr = {"apple", "pear", "cherry"};
        System.out.println( Arrays.toString(revArr(arr)));

    }

    public static String[] revArr (String[] arr) {

        String [] arr1 = new String[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[count] = arr[i];
            count++;
        }
        return arr1;
    }
}
