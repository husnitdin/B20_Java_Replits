package Replit;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String st = "";

        for (int m = 0; m<=n-1; m++){
            if ( m < n ){
                st += "*";
            }
            System.out.println(st);
        }

    }
}
