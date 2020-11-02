package Replit;

/*
The Utopian Tree grows exactly 1 cm for the first three years,
and after that it grows by 2 cm every year, this is a simple implementation of the algorithm.
You will need to use loops to create it.
Show 10 years of growth of the Utopian Tree.

Output:
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10
 */

public class UtopianTree {
    public static void main(String[] args) {

        int year = 0;
        int growth = 0;
        int size = 0;

        for (int i = 0; i < 3; i++) {
            year += 1;
            if (year <= 3) {
                growth += 1;
                size = 1;
            }
            System.out.println("year "+ year+" - growth "+ size+ " cm");
            System.out.println("tree size: "+ growth+" cm");
        }

            for (int i = 4; i <= 10; i++) {
                year+=1;
                if (year > 3 && year <= 10){
                    growth +=2;
                    size = 2;
                }

            System.out.println("year "+ year+" - growth "+ size+ "cm");
            System.out.println("tree size: "+ growth+" cm");
        }
    }
}
