

/**
 * by kadan's algorithum
 * maxSubSum
 */
public class maxSubSum {
        public static void maxSubSum(int nums[]){
            int currsum=0;
            int maxSum=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                currsum=currsum+=nums[i];
                if(currsum<=0){
                    currsum=0;
                }
                maxSum=Math.max(currsum,maxSum);
            }
            System.out.print("our maxsum subArray sum:"+" "+maxSum);

        }
    public static void main(String args[]){
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
           maxSubSum(nums);
    }
    
}


/*
out put

our maxsum subArray sum: 7

*/ 