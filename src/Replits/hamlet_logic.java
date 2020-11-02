package Replit;
/* The danish prince most famous quote is "to be or not to be". that's a classic example of boolean logic.
the hamletQuote method only returns true if one of  or both of the boolean parameters is true.
example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false
hint: use the truth table for this one, this can be done with one if and a logical operator. */

public class hamlet_logic {
    public boolean hamletQuote(boolean toBe,boolean notToBe) {
        boolean result = false;

        if ( toBe || notToBe ){
            result = false;
        } else if ( notToBe || toBe ){
            result = false;
        } else if ( toBe || toBe ){
            result = true;
        } else if (notToBe || notToBe ){
            result = false;
        }
        return result;
    }
}
