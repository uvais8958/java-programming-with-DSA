import java.util.Scanner;

/**
 * Matrices
 */
public class Matrices {

    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
out put

1 2 3 4 5 6 7 8 9
1 2 3 
4 5 6 
7 8 9 


*/ 