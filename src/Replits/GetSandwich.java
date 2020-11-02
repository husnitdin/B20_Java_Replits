package Replit;
/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string,
or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GetSandwich {
    public static <ArraysList> void main(String[] args) {

        String str = "xxbreadbreadapplebread";

            String[] arr = str.split("ead");
            System.out.println( arr[1].substring(0, arr[1].length()-2));


    }
}