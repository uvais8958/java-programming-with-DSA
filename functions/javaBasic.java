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


     public static void swap(int a, int b){
            //swap temp
                 int temp=a;
                 a=b;
                 b=temp;
                // System.out.println("a="+a);
                // System.out.print("b="+b);
     }


     public static void  chageA(int a){
           a=10;
           System.out.print("Copy value"+a);//only in the function
     }

     public static int factorial(int n){
      int f=1;
      for(int i=1;i<=n;i++){
        f=f*i;

      }
      return f;

     }

     public static int binomialCoffeecient(int n,int r){
      int n_factorial=factorial(n);
      int r_factorail=factorial(r);
      int nmr_factorial=factorial(n-r);
      int binomialCoffe=n_factorial/(r_factorail*nmr_factorial);
      return  binomialCoffe;
     }

//calculate 2 num of sum
//      public static int sum(int a,int b){
//       return a+b;
//      }
// //calculate 3num of sum
//      public static int sum(int a,int b,int c){
//       return a+b+c;
//      }


public static int sum(int a,int b){
  return  a+b;
}

public static float sum(float a,float b){
  return a+b;
}


    public static void main(String args[]){
              Scanner sc= new Scanner(System.in);
             System.out.println("sum="+sum(5, 3));//8
             System.out.print("function overloading="+sum(3.2f,4.8f));//8.0




             //System.out.print(binomialCoffeecient(5, 2));//10
                



              // int a=20;
              // chageA(a);
            //   System.out.print(a);   //original value
              
              
              //swap-values exchanges
                //  int a=10;
                //  int b=20;
                //  swap(a, b);//a=20 b=10


                //    System.out.println("a="+a);//10
                // System.out.print("b="+b);//20
                 
                 //swap temp
                //  int temp=a;
                //  a=b;
                //  b=temp;
                // System.out.println("a="+a);
                // System.out.print("b="+b);
                









              //  int a=sc.nextInt();
        //  int b=sc.nextInt();        
         // int product=multiPlication(a, b);
        // System.out.print("products of a & b:"+product);
     

        //  int sum= calCulateSum(a,b);//arguments or actual paraters
        //  System.out.print("Sum="+sum);


    }
}
