package Replit;

public class CalcObj {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2

    }
}
