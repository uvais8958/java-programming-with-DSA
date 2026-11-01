package Recursion;

/**
 * PowerRecursion
 */
public class PowerRecursion {

    public static int power(int x,int n){
        //Base Case
        if(n==0){
            return 1;
        }
        //recursion call
        int half=power(x, n-1);
        //work
        return x*half;
    }

    public static int optimizeSolution(int x,int n){
        //Base case
        if(n==0){
            return 1;
        }
        //recursion coll
        int half=optimizeSolution(x, n/2);
        //check even number
        if(n%2==0){
            return half*half;
        }
        //check odd number
        else{
            return x*half*half;
        }
    }
    public static void main(String args[]){
        int x=2;
        int n=3;
        //int result=power(x, n);
        //System.out.print(result);//32
        int optimize=optimizeSolution(x, n);
        System.out.print(optimize);//8
    }
}