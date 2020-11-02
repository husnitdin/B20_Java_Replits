package Replit;

public class PrintAttributesObj {
    public static void main(String[] args) {

        PrintAttributes a = new PrintAttributes();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString());
    }

}


