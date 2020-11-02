package Replit;
/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord

Example:
input: This
input: And
input: 2
output: ThisAndThis

Example:
input: This
input: And
input: 1
output: This
 */
public class RepeatSeparator {
    public static void main(String[] args) {

        String word = "This";
        String separator = "And";
        int count = 1;

        String result = "";
        for (int i = 0; i < count-1 ; i++) {
            result = word+separator;
            System.out.print(result);
        }
        System.out.print(word);
    }
}
