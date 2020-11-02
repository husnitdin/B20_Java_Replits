package Replits;
/*
Write a a method appearsTwice() that returns true if value of variable target appears only twice
in the string sentence, otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!")
      - returns false, because java appears only once.

Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
      - returns true, because laptop appears twice.
 */
public class AppearsTwice {


    public static void main(String[] args) {

    }

    public static boolean appearsTwice(String target, String sentence) {

        int count=0;
        for (int i = 0; i <=sentence.length()-target.length() ; i++) {
            String str=sentence.substring(i,i+target.length());
            if(str.contains(target)){
                count++;
            }
        }
        return (count == 2);
    }

}
