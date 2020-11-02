package Replit;
/* c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
 */

public class return_ProfitLoss {

    public String c_profits (int buyPrice,  int sellPrice) {
       String result;

       if ( buyPrice < sellPrice ) {
           result = "loss";
       } else if ( buyPrice > sellPrice ) {
           result = "profit";
       } else {
           result = "no loss";
       }
       return result;
    }
}
