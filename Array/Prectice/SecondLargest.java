package Array.Prectice;

import java.util.Arrays;

public class SecondLargest {

    public static int secondLar(int arr[]){

    Arrays.sort(arr);
    int largest=arr[arr.length-1];
    for(int i=arr.length-2; i>=0;i--){
        if(arr[i]<largest){
            return arr[i];
        }
    }
    return -1;
    }
    

    public static void main(String args[]){

        int arr[]={12,35,1,10,34,1};
        System.out.print(secondLar(arr));
    }
    
}
