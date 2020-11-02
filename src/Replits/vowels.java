package Replit;
/* Inputs:
String word;
Write a for loop that will loop through every letter of the input
and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue */
import java.util.Scanner;
public class vowels {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();

            String result = "";

            for( int i = 0; i<=word.length()-1; i++) {
                char ch = word.charAt(i);
                if ( ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                    result += ""+ch;
                }
            }

            System.out.println(result);

        }
    }
