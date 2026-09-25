package Array;
import  java.util.*;

/**
 * arrayBaiscs
 */
 class arrayBasics {

    public static void main(String args[]){
        int marks[]=new int [50];
        Scanner sc= new Scanner (System.in);
        marks [0]=sc.nextInt();
        marks [1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("physics"+" "+marks[0]+" "+"chemistry"+" "+marks[1]+" "+"Math"+" "+marks[2]);
        marks[2]=marks[2] +10;
        System.out.print("Math marks increase of 10"+" " + marks[2]);
        
        System.out.print(" Marks length"+" "+marks.length);//marks length 50

    }
}