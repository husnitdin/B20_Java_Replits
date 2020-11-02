package Replit;

import java.util.Arrays;

/*
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */
public class CombineArrays {
    public static String combineRs(String[] r1,String[] r2) {

        String result = "";

        for(String each: r1){
            result+=each;
        }

        for(String each: r2){
            result+=each;
        }
        return (result);
    }

    public static void main(String[] args) {
        String[] strArr1 = {"f","o","o"};
        String[] strArr2 = {" b","a","r"};
        System.out.println( combineRs ( strArr1, strArr2 ) );
    }
}
