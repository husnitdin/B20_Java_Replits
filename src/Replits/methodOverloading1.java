package Replit;
/*
In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
First method should work with array of integers (int[]) and return int,
and second method should
work with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.

Comment: Methods should be non static and with a return type.
 */
public class methodOverloading1 {

    int findMax(int[] arr){
        int maxNum = arr[0];
        for (int each: arr){
            if(maxNum < each){
                maxNum = each;
            }
        }
        return maxNum;
    }

    double findMax(double[] arr){
        double maxNum = arr[0];
        for (double each: arr){
            if(maxNum < each){
                maxNum = each;
            }
        }
        return maxNum;
    }
}
