package Replit;
/*
Given the array words, it will print the word with the largest length.
Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa */

public class MaxLengthString {
    public static void main(String[] args) {

        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        String longWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (longWord.length() < words[i].length()){
                longWord = words[i];
            }
        }
        System.out.println(longWord);
    }
}
