package Array.Prectice;

/**
 * SecondLargestBetter Approach
 */
public class SecondLargestBetter {
    public static int secondLarge(int arr[]){
        int largest=1;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];

            }
        }
        return secondLargest;
    }
public static void main(String args[]){
    int arr[]={12,35,1,10,34,1};
    System.out.print(secondLarge(arr));
}
    
}