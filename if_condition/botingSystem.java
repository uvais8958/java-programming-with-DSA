package if_condition;
import java.util.*;
/**
 * botingSystem
 */
public class botingSystem {

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.print("you are eleigible for boting..");
        }else{
            System.out.print("you are not eligible for boting...");
        }

    }
}