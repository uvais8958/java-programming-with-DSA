
package Array;
import java.util.*;

/**
 * largestSmallestValue
 */
public class largestSmallestValue {
    public static int largeValue(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return  largest;


    }

    public static int smallest(int numbers[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(small>numbers[i]){
                small=numbers[i];
            }
        }
        return  small;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,6,4,5,};
           System.out.println("largest value is at :"+ largeValue(numbers));//
           System.out.print("smallest value is at :"+ smallest(numbers));
    }
}


/*
out put

largest value is at :6
smallest value is at :1

*/ 