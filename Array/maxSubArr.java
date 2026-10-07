/**
 * by the Prefix approach
 * maxSubArr
 */
public class maxSubArr {
            public static void maxSubarr(int numbers[]){
                int currentSum=0;
                int maxiMumSum=Integer.MIN_VALUE;
                int prefix[]=new int [numbers.length];
                prefix[0]=numbers[0];
                //calculate prefix array
                for(int i=1;i<prefix.length;i++){
                   prefix[i]=prefix[i-1]+numbers[i];
                }

                //find the maximum subarray Sum 
                for(int i=0;i<numbers.length;i++){
                    int start=i;

                    for(int j=i;j<numbers.length;j++){
                        int end=j;

                        currentSum=start==0
                        ?prefix[end]:
                        prefix[end]-prefix[start-1];
                        
                        if(maxiMumSum<currentSum){
                            maxiMumSum=currentSum;
                        }
                    }
                }
                System.out.print("maximum Sum="+maxiMumSum);
            
            }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        maxSubarr(numbers);
    }
}

/*
out put

maximum Sum=8

*/ 