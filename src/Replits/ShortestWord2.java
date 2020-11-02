package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
 */
public class ShortestWord2 {
    public static void main(String[] args) {

        String str= "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(str.split(", ")));

        ArrayList<String> arrShort = new ArrayList<>();

        String shortWord = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (shortWord.length() > arr.get(i).length()) {
                shortWord = arr.get(i);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if(shortWord.length() == arr.get(i).length()) {
                arrShort.add(arr.get(i));
            }
        }

        Collections.sort(arrShort);

        System.out.println(arrShort);
    }
}
