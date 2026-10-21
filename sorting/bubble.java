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

                    public static void selectionSort(int numbers[]){
                        for(int i=0;i<numbers.length;i++){
                            int minIndex=i;
                            for(int j=i+1;j<numbers.length;j++){
                                if(numbers[minIndex]>numbers[j]){
                                    minIndex=j;
                                }
                            }
                            //swap
                      int temp=numbers[i];
                      numbers[i]=numbers[minIndex];
                      numbers[minIndex]=temp;
                        }
                    }
                    public static void inserTionSort(int numbers[]){
                        for(int i=0;i<numbers.length;i++){
                            int curr=numbers[i];
                            int prev=i-1;
                            //finding at the correct pos to insert
                            while (prev >= 0 && numbers[prev]>curr) {
                                 numbers[prev+1]=numbers[prev];
                                 prev--;
                                 numbers[prev+1]=curr;                       
                            }
                        }
                    }
                     //counting Sort
                     public static void countingSort(int numbers[]){
                    int largest=Integer.MIN_VALUE;
                    for(int i=0;i<numbers.length;i++){
                   largest=Math.max(largest, numbers[i]);
                    }
                    int count[]=new int[largest+1];
                    for(int i=0;i<numbers.length;i++){
                        count[numbers[i]]++;
                    }
                    //sorting
                    int j=0;
                    for(int i=0;i<numbers.length;i++){
                        while (count[i]>0) {
                            numbers[j]=i;
                            j++;
                            count[i]--;
                        }
                    }
                 }
                 //for print the array
                 public static void printArray(int numbers[]){
                    for(int i=0;i<numbers.length;i++){
                        System.out.print(numbers[i]+" ");//  1 2 3 5 8 
                    }
                 }
                 
                
    public static void main(String args[]){
        int numbers[]={1,4,1,3,2,4,3,7};
           
           //bubbleSort(numbers);//1 2 3 5 8 
           //inserTionSort(numbers);//1 2 3 5 8 
         // selectionSort(numbers);//1 2 3 5 8 
         countingSort(numbers);//1 1 2 3 3 4 4 7 
           printArray(numbers);
    }
}


//output
//3 4 5 7 8 
