package Recursion;

public class FriendsPair {
   public static int pair(int n){
     //base case
    if(n==1 || n==2){
        return n;
    }
    //single
    int single=pair(n-1);
    //pairs
    int pair=pair(n-1)*pair(n-2);
    return single+pair;

   }
    public static void main(String args[]){
        int n=3;
        System.out.print(pair(n));//4
    }
}
