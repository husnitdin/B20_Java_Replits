package Replit;
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace
output: red
 */
public class Shortest_Word {

    public static void main(String[] args) {

        String [] str = {"java", "cable", "red", "vivid", "remedy", "grace"};

        String min = str[0];
        for (int i = 0; i<str.length; i++) {
            if (min.length() > str[i].length()) {
                min = str[i];
                i++;
            }
        }
        System.out.println(min);
    }
}
