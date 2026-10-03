/**
 * maxSubArr
 */
public class maxSubArr {
public static void maxSub(int numbers[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    int prifix[]=new int [numbers.length];
    prifix[0]=numbers[0];
    //calculate prifix Array
    for(int i=0;i<prifix.length;i++){
        prifix[i]=prifix[i-1]+numbers[i];
    }
    
}
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
    }
}