/**
 * diagonal
 * Q1 Diagonal sum
 * Q2 search in sorted matrix
 */
public class diagonal {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        // for(int i=0;i<=matrix.length;i++){   (TC=n^2)
        //  for(int j=0;j<=matrix[0].length-1;j++){
        //     if(i==j){
        //      sum+=matrix[i][j];
        //     }
        //     else if(i+j==matrix.length-1){
        //         sum+=matrix[i][j];
        //     }
        //  }
        // }
        // return sum;

        
        for(int i=0;i<=matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-i-1];

        }
        return sum;
    }

    public static boolean stairCaseSearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println();
        return  false;

    }
 public static void main(String args[]){
    // int matrix[][]={{1,2,3,4,},
    //                 {5,6,7,8},
    //                 {9,10,11,12},
    //   System.out.print(diagonalSum(matrix));
    
    int matrix[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
    int key=33;
    stairCaseSearch(matrix, key);  // found key at (3,1)
 }
    
}