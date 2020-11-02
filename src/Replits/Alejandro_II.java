package Replit;
import java.util.Scanner;
public class Alejandro_II {

    /*
    Alejandro had a lot of emails to read.
    he wants to add more conditions to his program, he wants only job related mails
    so he will narrow it down by also checking if the word "project" also appears beside his name,
    that way he will be sure its a job email that refers to him.

for example:
a = "dear alejandro.....alot of text"
outputs: "dont read"

a = "thunder blaz is the best drink in the galaxy..."
outputs: "dont read"

a = "subject : important project, alejandro we refer to you  this ...."
outputs: "read this mail"
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if (a.toLowerCase().contains("alejandro") && a.toLowerCase().contains("project")) {
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }
    }
}