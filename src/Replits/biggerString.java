package Replit;
/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */
public class biggerString {

    public static String biggerS(String a ,String b) {
        if (a.length() > b.length()){
            return (a);
        } else {
            return (b);
        }
    }

    public static void main(String[] args) {
        String a = "apple";
        String b = "orange";

        System.out.println(biggerS(a, b));
    }
}
