package Replit;

class LameCalculator {

    int num1;
    char method;
    int num2;

    public void Calculator(int num1, char method, int num2){
        this.num1 = num1;
        this.method = method;
        this.num2 = num2;

    }

    public int plus(int num1, int num2) {
        return (num1 + num2);
    }

    public int minus(int num1, int num2) {
        return (num1 - num2);
    }

    public int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    public int divide(int num1, int num2) {
        return (num1 / num2);
    }
}
