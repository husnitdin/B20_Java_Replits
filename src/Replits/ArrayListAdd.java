package Replit;
import java.util.ArrayList;
/*
We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is .add()

The following code will take an ArrayList of Strings called strs and add "Hello" to it.
str.add("Hello");

The syntax follows something like:
arraylistvariable.add(data to add);

In the space to the left, add three names (any names) to the ArrayList called names.
 */
public class ArrayListAdd {

    public static ArrayList<String> test() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alex");
        names.add("Max");
        names.add("Ross");
        return names;
    }
}
