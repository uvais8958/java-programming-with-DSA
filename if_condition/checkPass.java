package if_condition;
import java.util.*;
public class checkPass {
    public static void main(String args[]){
        // int pass=12345;
        // if(pass==12345){
        //     System.out.print("user login...");//user login
        // }else{
        //     System.out.print("wrong password...!");
        // }

        Scanner sc =new Scanner (System.in);
       int  pass=sc.nextInt();
       if(pass==pass){
        System.out.print("login...");
       }else{
        System.out.print("wrong passowrd!");
       }
    }
}
