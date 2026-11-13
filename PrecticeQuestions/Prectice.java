package PrecticeQuestions;

/**
 * Prectice
 */
public class Prectice {

    // public static int findKey(int array[],int key){
    //     for(int i=0;i<array.length;i++){
    //         if(array[i]==key){
    //             return i;
    //         }
            
    //     }
    //     return -1;
    // }

    // public static int largestArray(int array[]){
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<array.length;i++){
    //         if(largest<array[i]){
    //             largest=array[i];
    //         }
    //     }
    //     return largest;
    // }

    public static int smallest(int array[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(small>array[i]){
                small=array[i];
            }
        }
        return small;
    }

    public static void main(String args[]){
        int array[]={2,4,6,8,10,12,14,16};
        int key=10;
        // System.out.print(findKey(array, key));
       // System.out.print(largestArray(array));
       System.out.print(smallest(array));
    }
}