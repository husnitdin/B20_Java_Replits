package Replit;
import java.util.ArrayList;
/*
search(["one apple","two orange","four banana"],"four")
returns:
"four banana"
("four banana" contains "four" so method returns "four banana")

search(["hello","world"],"goodbye")
returns:
"search failed"
(no "goodbye" in any element)

hint:
use contains string method to test if element has word value in it.
 */
public class Methods_with_ArrayList15_search {

    public static String search(ArrayList<String> r, String find ){
        String result = "";
        for (String each: r){
            if( each.contains(find)){
               result = each;
               break;
            } else {
               result = "search failed";
            }
            System.out.println(each );
        }
        return find;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");

        String find_tst = search(arr, "abd");
        System.out.print(find_tst);//foo bar
    }
}
