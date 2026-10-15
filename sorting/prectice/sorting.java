package sorting.prectice;

/**
 * sorting
 */
public class sorting {
               public static void bubbleSort(int arr[]){
                for(int i=0;i<arr.length-1;i++){
                    for(int j=0;j<arr.length-1-i;j++){
                        if(arr[j]>arr[j+1]){
                            //swap
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
                    }
                }
               }
               public static void printArra(int arr[]){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]);
                }
               }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);//1123345678
        printArra(arr);
    }
}