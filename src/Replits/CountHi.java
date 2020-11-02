package Replit;
/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
 */
public class CountHi {
    public static void main(String[] args) {

        String str = "abc hi ho";

        int count =0;
        for (int i = 0; i <= str.length()-2; i++) {
            String word = str.substring(i,i+2);
            if (word.equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
        }
    }

