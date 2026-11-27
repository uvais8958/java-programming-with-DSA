package Array.Prectice;

/**
 * rotatedOptimal
 */
public class rotatedOptimal {

    public static void rotated(int arr[],int d){
        int n=arr.length;
        if(n==0) return ;
         d=d%n;

        //
        //Reverse first d elements
        reverse(arr,0,d-1);
        
        //reverse remaining elements
        reverse(arr,d,n-1);

        //reverse entire array
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        rotated(arr, d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}