package Replit;
/*
This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

 */
public class limitString {
    public static String limit(String text, int maxLength) {
        String result = text.substring(0, maxLength);
        return (result);
    }

    public static void main(String[] args) {
        String text = "bla bla";
        int maxLength = 3;
        System.out.println(limit(text, maxLength));
    }
}
