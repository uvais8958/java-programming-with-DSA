package functions;
import java.util.*;
public class javaBasic {
     public static void printHellow(){
      System.out.println("hellow java....");
      System.out.print("Hii i am a developer");
     }


    //  public static void calCulateSum(){
    //     Scanner sc= new Scanner(System.in);
    //      int a=sc.nextInt();
    //      int b=sc.nextInt();
    //      int sum=a+b;
    //      System.out.print("Sum="+sum);

    //     return;
    //  }


        //function with parameters
        public static int calCulateSum(int a,int b){//parameters//formal parameter
       
         int sum=a+b;
       

        return sum;
     }
            
     //products of multiplication
     public static int  multiPlication(int a,int b){
        int product=a*b;
        return  product;
     }


    public static void main(String args[]){
              Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
        int product=multiPlication(a, b);
        System.out.print("products of a & b:"+product);
     

        //  int sum= calCulateSum(a,b);//arguments or actual paraters
        //  System.out.print("Sum="+sum);
    }
}
