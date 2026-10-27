package Recursion;

public class RecursionBasic {

    //Factorial progrrame
    public static int  fact(int n){
        //Base Case
        if(n==0 || n==1){
            return 1;
        }
        return  n*fact(n-1);
    }



    //fibonacci series
    public static int fibon(int n){
        if(n<=1){
            return n;
        }
        return fibon(n-1)+fibon(n-2);
    }


    //n to 1 decreasing orders 
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
        return ;
        }
        System.out.print(n +" ");
        printDec(n-1);

    }

    //n to 1 increasing order
    public static void printIncre(int n){
        if(n==1){
            System.out.print(n + " ");
        return ;
        }
        printIncre(n-1);
        System.out.print(n + " ");

    }

    public static void main(String args[]){
        int n=10;
     
     
        //System.out.print(fact(n));//120
       // System.out.println(fibon(n));//8
   
       //printDec(n);//10 9 8 7 6 5 4 3 2 1
        printIncre(n); //1 2 3 4 5 6 7 8 9 10     
    }
}
