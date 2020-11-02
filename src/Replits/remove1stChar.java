package Replit;
/*
The method gets a string and returns a string minus the first string.

for example:

removeFirst("aaa")
returns "aa"

 */
public class remove1stChar {

    public static String removeFirst(String target) {
        return (target.substring(1));
    }

    public static void main(String[] args) {
        String target = "aaa";
        System.out.println(removeFirst(target));
    }
}
