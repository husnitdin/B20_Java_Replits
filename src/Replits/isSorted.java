package Replit;

public class isSorted {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 6};

        boolean result = true;

        for(int i=0; i<=arr.length-1; i++) {

            for(int j=1; j<=arr.length-1; j++) {

                if(arr[i] < arr[j] ) {
                    result =  true ;
                } else {
                    result =  false ;
                }
            }
        }
        System.out.println(result);
    }
}
