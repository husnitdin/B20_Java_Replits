package Replit;
/*
Given a string, print out true if the number of appearances of "java"
anywhere in the string is equal to the number of appearances of "python"
anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
public class EqualsJavaPython {
    public static void main(String[] args) {

        String sentence = "What's the difference between java, javascript and python?";
        String java = "java";
        String python = "python";

        int countJ = 0;
        int countP = 0;

        for (int i=0; i <= sentence.length()-java.length(); i++){
            if (java.equals(sentence.substring(i, i+java.length()))){
                countJ++;
            }
        }

        for (int i=0; i <= sentence.length()-python.length(); i++){
            if (python.equals(sentence.substring(i, i+python.length()))){
                countP++;
            }
        }

        if(countJ == countP) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
