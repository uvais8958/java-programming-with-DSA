package prectice_questions;

/**
 * patterns
 * Q1 print star patterns
 * 
 *            *
 *            * *
 *            * * *
 *            * * * *
 * Q2 print inverted-star pattern
 * 
 *           ****
 *           ***
 *           **
 *           *
 *       
 * Q2 Half-pyramid pattern
 *          1
 *          1 2
 *          1 2 3
 *          1 2 3 4    
 * Q3 character pattern
 *           A
 *           B C
 *           D E F 
 *           G H I J
 * 
 * 
 */
public class patterns {
    public static void printStar(int n){
          for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printInvertedStar(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
             System.out.println();
        }
    }
    public static void halfpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
        System.out.println();
        }

    }
    public static void characterPattern(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n=4;
         //printStar(n);
         //printInvertedStar(n);
        // halfpyramid(n);
        characterPattern(n);
    }
    
}

/*
Q1 of answer out put

*
**
***
****

Q2 of answer output

****
***
**
*

Q3 of answer output

1
12
123
1234


Q 4 of answer out put pattern

A 
B C 
D E F 
G H I J 

*/ 