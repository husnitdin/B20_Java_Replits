package Replit;
import java.util.Arrays;
import java.util.Scanner;
/* Given an int array, print a new array with double the length
where its last element is the same as the original array, and
all the other elements are 0. The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.
Example:
input: 4 5 6
output: [0, 0, 0, 0, 0, 6]

Example:
input: 0
output: [0, 0]

Example:
input: 1 2 3 4
output: [0, 0, 0, 0, 0, 0, 0, 4]
 */
public class Arrays_MakeLast {
    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 7;
        nums[2] = 7;
        nums[3] = 7;

        int[]douInt = new int[(nums.length-1)*2];
        douInt[douInt.length-1] = nums[nums.length-2];
        System.out.println(Arrays.toString(douInt));

    }
}
