package Replit;
/*
Anagram is a word, phrase, or name formed by rearranging the letters of another,
such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false
 */

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "ka      lisha";
        String word2 = "ash li KA";
        System.out.println(isAnagram(word1, word2));
    }

    public static boolean isAnagram(String word1, String word2) {

        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", "");

        boolean result = true;
        if (word1.length() == word2.length()){
            String[] str1 = word1.split("");

            for (String each: str1){
                if(!word2.contains(each)){
                    result = false;
                } else {
                     result = true;
                }
            }

        } else {
            result = false;
        }
        return ( result );

    }
}




















