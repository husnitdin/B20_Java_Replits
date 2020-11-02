package Replit;
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: falseΩ≈
 */

public class hasAJava {
    public static void main(String[] args) {

        boolean exists = false;
        String word = "c";

        if (word.length() > 4){

            String j = word.substring(0, 4);
            String j1 = word.substring(1, 5);

            if (j.equalsIgnoreCase("java") || j1.equalsIgnoreCase("java")){
                exists = true;
            } else {
                exists = false;
            }

        } else {
            exists = false;
        }


        System.out.println(exists);
    }

}
