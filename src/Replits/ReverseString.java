package Replit;
/*
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tneduts"
 */

public class ReverseString {

    public static String reverse(String input){

        String[] strArr = input.split("");
        String result = "";

        for (int i = input.length()-1; i >=0 ; i--) {
            result += ""+strArr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "anka";
        System.out.println(reverse(str));
    }
}
