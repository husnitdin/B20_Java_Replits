package Replit;

import java.util.Arrays;

/*
Method addElements accepts 2 int arrays and adds each element value of two arrays
and returns a new array. You can assume that each array has 5 elements

addElements([10, 40, 50, 3, 1], [11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]
 */
public class AddElements {

    public static void main(String[] args) {
        int[] ints1 = {10, 40, 50, 3, 1};
        int[] ints2 = {11, 0, 500, 44, 1101};

        System.out.println(Arrays.toString(addElements(ints1, ints2)));
    }

    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] newArr = new int [ints1.length];

        for (int i = 0; i < ints1.length; i++) {
            newArr[i] = (ints1[i]+ints2[i]);
        }
        return (newArr);
    }
}
