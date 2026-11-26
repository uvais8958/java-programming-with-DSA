package Array.Prectice;

/**
 * rotatedD
 */
public class rotatedD {

    public static void rotated(int arr[],int d){
        int n=arr.length;
            d=d%n;
        int [] temp=new int[d];
           //store the first d element
           for(int i=0;i<d;i++){
            temp[i]=arr[i];
           }
           //shift remaining elements left
           for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
           }
           //put temp elements at the end
           for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
           }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
       rotated(arr, d);
      //print rotated array
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}