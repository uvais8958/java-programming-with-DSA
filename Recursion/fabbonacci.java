package Recursion;

/**
 * fabbonacci
 */
public class fabbonacci {
    
    public static int fab(int n){
        //base case
        if(n==0){
            return 0;
        }if(n==1){
           return 1;
        }
        return fab(n-1)+fab(n-2);
    }
    public static void main(String args[]){
        int n=6;
        System.out.print(fab(n));//8
    }
}