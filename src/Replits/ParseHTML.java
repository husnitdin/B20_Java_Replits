package Replit;

/*
Write a program, that will read html variable and output attribute value of id attribute (tag)
into the console. Input will be provided in a single line as outlined below. If html variable
doesn't contain <html> attribute, print out into the console message: "Invalid input!".

Example:
input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
output: myid
 */
public class ParseHTML {
    public static void main(String[] args) {

        String html= "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

        if(html.contains("html")){
            String[] arr = html.split("id=\"");

            System.out.println(arr[1].substring(0, arr[1].indexOf("\"")));

        } else {
            System.out.println("Invalid input!");
        }



    }
}
