// package Array;
// //max sub Array by brute force


// public class maxSubArray {
//     public static void maxSubArr(int numbers[]){
//           int currentSum=0;
//           int maxSum=Integer.MAX_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             int start=i;
//             for(int j=i;j<numbers.length;j++){
//                 int end=j;
//                 currentSum=0;
//                 for(int k=start;k<end;k++){
//                     currentSum+=numbers[k];
//                 }
//                 System.out.print(currentSum);
//             }
//             if(maxSum<currentSum){
//                 maxSum=currentSum;
//             }
//         }
        
//     }
//     public static void main(String args[]){
//         int numbers[]={1,-2,6,-1,3};
//     maxSubArr(numbers);


//     }
 
// }
