package Replit;

import java.util.Arrays;

public class DupFreqUniq {
    public static void main(String[] args) {
        String str = "asjdddsfnsfif";

        // REMOVE DUPLICATES:
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        String result = "";

        for (int i = 0; i < arr.length-1; i++) {
            if ( !result.contains(arr[i])){
                result += arr[i];
            }
        }
        System.out.println("Non duplicates: "+result);

        // COUNT FREQUENCY:
        String [] nonDup = result.split("");
        String uniqElements = "";

        for (int i = 0; i < nonDup.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (nonDup[i].equals(arr[j])) {
                    count++;
                }
            }
            System.out.print(nonDup[i]+count+" ");

            // UNIQUE ELEMENTS
            if (count == 1) {
                uniqElements += nonDup[i];
            }
        }
        System.out.println();
        System.out.println("Uniques "+uniqElements);
    }
}
