package Replit;
/*
Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic are both palindromes
- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true

 */
public class Palindrome {
    public static boolean isPalindrome(String str){
        str  = str.replace(" ", "");
        String result = "";
        for (int i = str.length()-1; i>=0; i--) {
            result +=""+str.charAt(i);
        }

        if(str.equalsIgnoreCase(result)){
            return (true);
        } else {
            return (false);
        }
    }

    public static void main(String[] args) {
        String str = "Race car";

        System.out.println( isPalindrome(str) );
    }
}
