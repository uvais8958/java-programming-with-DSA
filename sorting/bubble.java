package sorting;

/**
 * bubble
 */
public class bubble {
public static void bubbleSort(int numbers[]){
    //outer 
    for(int i=0;i<numbers.length-1;i++){
        //inner
        for(int j=0;j<numbers.length-1-i;j++){
            if(numbers[j]>numbers[j+1]){
                //swap
                int temp=numbers[j];
                numbers[j]=numbers[j+1];
                numbers[j+1]=temp;

            }
        }
    }
}
                 //for print the array
                 public static void printArray(int numbers[]){
                    for(int i=0;i<numbers.length;i++){
                        System.out.print(numbers[i]+" ");
                    }
                 }
    public static void main(String args[]){
        int numbers[]={7,5,4,3,8};
           bubbleSort(numbers);
           printArray(numbers);
    }
}