package Replit;
/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */
public class PrintUniqueWords {
    public static void main(String[] args) {

        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};

        for (String each: words ){
            int count = 0;
            for (String item: words){
                if (each.equalsIgnoreCase(item)){
                    count++;
                }
            }

             if (count == 1){
                 System.out.println(each);
             }
        }
    }
}
