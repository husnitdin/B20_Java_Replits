package Replit;
/* Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true
                            Example:
                            input: catcat
                            output: false
Example:
input: cat-cheetah-dog-cat
output: false   */

public class catDog {
    public static void main(String[] args) {

        int countOfCats = 0;
        int countOfDogs = 0;
        String word = "cat-cheetah-dog-cat";

        String cat ="";

        for (int i = 0; i <= word.length()-3; i++) {

                if (word.substring(i, i+3).equalsIgnoreCase("cat")){
                    countOfCats++;
                }

                if (word.substring(i, i+3).equalsIgnoreCase("dog")){
                countOfDogs++;
            }
        }

        if (countOfCats == countOfDogs)
            System.out.println(true);
        else
            System.out.println(false);
    }
}

