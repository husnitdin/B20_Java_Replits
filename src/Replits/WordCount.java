package Replit;
/*
This method gets a string and returns the word count of that string.
example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1
 */

public class WordCount {
    public static void main(String[] args) {
        String str = "one two three ewrw wefw gwegw";
        System.out.println(wordCount(str));
    }


    public static int wordCount(String words) {
        String[] wordCount = words.split(" ");
        int count  = 0;

        for (String each: wordCount){
            count++;
        }
        return count;
    }
}
