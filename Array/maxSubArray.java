

public class maxSubArray {
    //Max Sub Array sum by Beute Force
    public static void maxSubArray(int numbers[]){
      int currSum=0;
      int maxSum=Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            currSum=0;
            for(int k=start;k<end;k++){
                currSum=numbers[k];
                System.out.println(+currSum+" ");
            }
               if(maxSum<currSum){
                 maxSum=currSum;
                   }
        }
      }
      System.out.print("Maximum Sum:"+maxSum+" ");
    }
    public static void main(String args[]){

    int numbers[]={1,-2,6,-1,3}; 
    maxSubArray(numbers);
    }

}

/*
output


1

1 
-2

1 
-2 
6

1 
-2 
6 
-1

-2

-2 
6 

-2 
6 
-1 

6 
6 
-1 
-1 

Maximum Sum:6 










*/ 