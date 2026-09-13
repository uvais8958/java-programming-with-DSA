package prectice_questions;

import java.util.Scanner;

/**
 * varriables
 */
public class varriables {

    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
    
        //average of thease 3 number with input    


       //
        // int a=sc.nextInt();//10
        // int b=sc.nextInt();//20
        // int c=sc.nextInt();//30
        // int average=(a+b+c)/3;//(10+20+30)/3
        // System.out.print(average);//20


        //area of the square 

        // int side=sc.nextInt();
        // int area=side*side;//2
        // System.out.println(area);//4


              //total will amount with gst 18% 

        float pencil=sc.nextFloat();
        float erieser=sc.nextFloat();
        float pen=sc.nextFloat();
        float total=pencil+erieser+pen;
        System.out.println("Total amount :"+total);
      //Add new total with 18%gst
        float newTotal=total+(0.18f)*total;
        System.out.print("will due with GST 18%:"+newTotal);
        
        /*
        pencil=10;
        erieser=5;
        pen=10;
        total=25;
        newtTotal=25+(0.18f)*25=29.5;

        
        */

    }
}