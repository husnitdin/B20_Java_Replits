package Replit;

import java.util.ArrayList;
import java.util.Arrays;

/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time,
starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
public class StringMergeThem {
    public static void main(String[] args) {

        String one = "wooden";
        String two = "spoon";

        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();

        System.out.println(Arrays.toString(oneArr));
        System.out.println(Arrays.toString(twoArr));

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < oneArr.length; i++) {
            list.add(oneArr[i]);
        }
        for (int k = 1; k < twoArr.length; k++) {
            list.add(twoArr[k]);
            k++;
        }

        System.out.println(list);
    }
}
