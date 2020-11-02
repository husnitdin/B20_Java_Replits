package Replit;

/*
coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then
just return whole main itself covered [main].

- keep in mind that coverME value can be of any length.

Examples:
coverString("java methods", "me") ) ; ==> "java [me]thods"

coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

coverString("apples", "pears") ) ; ==> "[apples]"
 */
public class Cover {
    public static void main(String[] args) {
        String str1 = "Certified Wooden Spoon";
        String str2 = "o";

        String[] coverMeArr = str1.split(str2);
        String result = "";

        if (str1.contains(str2)) {

            for (int i = 0; i <= (coverMeArr.length - 1); i++) {
                System.out.print(coverMeArr[i] + "[" + str2 + "]");
            }
        }else{
                System.out.print("[" + str1 + "]");
            }
        }
    }


