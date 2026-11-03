package Recursion;

/**
 * BinaryString
 */
public class BinaryString {
         public static void binaryString(int n , int lastPlaced,String str){
            //base case
            if(n==0){
                System.out.println(str);
                return ;
            }
            //always place 0
            binaryString(n-1, 0, str + "0" );
            //place 1 only last place 0
            if(lastPlaced==0){
                binaryString(n-1, 1, str+ "1");
            }
         }
    public static void main(String args[]){
        int n=3;
        binaryString(n, 0, "");
    }
}

/*
000
001
010
100
101
*/ 

