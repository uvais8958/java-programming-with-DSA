package Recursion;

public class TillingProblem {
   
   public static int tillingP(int n){
    //Base Case
    if(n==0 || n==1){
        return 1;
    }
    //work
    //vertikal
    int fnm1=tillingP(n-1);
    //horizontal
    int fnm2=tillingP(n-2);
    int totalWays=fnm1+fnm2;
    return totalWays;
   }
    public static void main(String args[]){
      // System.out.print(tillingP(2));
      // System.out.print(tillingP(3));
     System.out.print(tillingP(4));


    }
    
}


//output: 2
//output : 3
//output: 5