package pattern;

public class palindromicNumbers {
    public static void palindromicNumbers(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //descending order
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //ascending order
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        palindromicNumbers(6);
    }
}




/*

outpu


     1
    212
   32123
  4321234
 543212345
65432123456



*/ 