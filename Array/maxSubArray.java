
/**
 * by the Brutre force Approach
 * maxSubArray
 */
public class maxSubArray {
public static void maxSubarray(int numbers[]){
  int currentSum=0;
  int maximumSum=Integer.MIN_VALUE;
  for(int i=0;i<numbers.length;i++){
    int start=i;
    for(int j=i;j<=numbers.length;j++){
      int end=j;
      currentSum=0;
         for(int k=start;k<end;k++){
             currentSum=numbers[k];
         }
         System.out.println(currentSum);
    
               if(maximumSum<currentSum){
               maximumSum=currentSum;
                }
    
        }
  }
  System.out.print("Maximum sum="+maximumSum);
             
}

  public static void main(String args[]){
    int numbers[]={1,-2,6,-1,3};
    maxSubarray(numbers);
  }
}


/*
out put

0
1
-2
6
-1
3
0
-2
6
-1
3
0
6
-1
3
0
-1
3
0
3
Maximum sum=6

Time complextity O(n^3)


*/ 