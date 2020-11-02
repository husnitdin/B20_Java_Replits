package Replit;
/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that, and an if that checks
if its the last or first iteration of the loop (so you will know when to print "*" or " ")
 */
public class Simple_Print_Pattern {
    public static void printHollowRect() {

        String star = "";
        //for (int i = 0; i< 2; i++ ){
        //    System.out.println("*");

            for (int j = 0; j<5; j++){
                star += star;
                System.out.println(star+""+star);

            }

       // }
    }

    public static void main(String[] args) {
        printHollowRect();
    }
}
