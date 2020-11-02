package Replit;
/*
Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
public class CountJava {
    public static void main(String[] args) {

        String word = "javaxjavaapplepearjavaegg";
        int count = 0;

        for(int i = 0; i<=word.length()-4; i++){
            if(word.substring(i, i+4).equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);
    }

}
