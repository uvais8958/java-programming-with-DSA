package Recursion;

/**
 * firstNaturalNumber
 */
public class firstNaturalNumber {
 
    public static int cal(int n){
        //Base case
        if(n==1){
            return  1;
        }
        int snm1=cal(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static void main(String args[]){
        int n=5;

        System.out.print(cal(n));//15
        
    }
}