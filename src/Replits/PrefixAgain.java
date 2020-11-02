package Replit;

public class PrefixAgain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 2;

        String word = str.substring(0, n);
        String result ="";
        int count = 0;

        for (int i = 0; i < (str.length()-word.length()+1); i++) {
            result = str.substring(i, i + word.length());

            if (word.equalsIgnoreCase(result)){
                count++;
            }
        }

        if (count == 1){
            System.out.println(false);

        } else if (count >= 2){
            System.out.println(true);
        }
    }
}

