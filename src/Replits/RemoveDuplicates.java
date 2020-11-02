package Replit;
/*
uniqueChars is a method that you will code now, should be able to accept any string
in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {

        String[] unChar = str.split("");
        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {
            if(!result.contains(unChar[i])){
                result +=""+unChar[i];
            }
        }
        return (result);
    }
}
