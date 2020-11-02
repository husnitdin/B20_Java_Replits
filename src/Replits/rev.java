package Replit;

import java.util.Arrays;

public class rev {

    public static void main(String[] args) {

        String[] ab = {"apple", "pear"};

        System.out.println(reverse(ab));
    }

    public static String reverse(String[] arr) {

        String result = "";

        for (String each: arr){

            for(int i=each.length()-1; i>=0; i--){
                result += each.charAt(i);
            }
            result  = result+" ";
        }

        return result;
    }
}
