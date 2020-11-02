package Replit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/* This method gets two strings (text and badWord)  and returns a string.

Basically what it dose is takes out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "
 */
public class Clean_String {

    public static String clean (String text ,String badWord) {

        String[] textArr = text.split(badWord);
        String result = "";

        for (String each: textArr){
            result +=each;
        }
        return (result);
    }


    public static void main(String[] args) {
        String text = "one two three";
        String badWord = "two";

        System.out.println(clean(text, badWord));
    }


}
