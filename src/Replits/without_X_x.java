package Replit;
/*
Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */
import java.util.Scanner;
public class without_X_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String ch1 = ""+word.charAt(0);
        String ch2 = ""+word.charAt(word.length()-1);

        if (ch1.equalsIgnoreCase("x")||ch2.equalsIgnoreCase("x")){
            if (ch1.equalsIgnoreCase("x")&&ch2.equalsIgnoreCase("x")){
                word=word.substring(1,word.length()-1);
                System.out.println(word);
            }else if(ch1.equalsIgnoreCase("x")){
                word=word.substring(1);
                System.out.println(word);
            }else if (ch2.equalsIgnoreCase("x")){
                word=word.substring(0,word.length()-1);
                System.out.println(word);
            }
        }else{
            System.out.println(word);
        }

    }
}
