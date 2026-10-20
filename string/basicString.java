package string;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class basicString {
    public static void main(String args[]){
        //   String name2=new String("Uvais");
        //   System.out.println(name2.toUpperCase());//UVAIS
        //   System.out.println(name2.toLowerCase());//uvais

        //   //concatenate
        //   String firstname="Uvais";
        //   String lastname="Ansari";
        //   String fullname= firstname + " " + lastname;
        //   System.out.print(fullname + " ");//Uvais Ansari 

          //by the user
        //   Scanner sc =new Scanner(System.in);
        //   String firstname=sc.next();//Uvais
        //   String lastname=sc.next();//Ansari
        //   String fullname=firstname + " " +lastname;
        //   System.out.print(fullname);//Uvais Ansari
        //   System.out.print(fullname.length());


            // String name;
        // Scanner sc=new Scanner(System.in);
        // name=sc.next();//Uvais only single word 
        // name=sc.nextLine();// Uvais Ansari fullline print
        // System.out.print(name);
  
        //String method 
        //1 length()

        String name="Uvais";
        //System.out.print(name.length());//5
           
        //2 toUppercase()
        System.out.println(name.toUpperCase());//UVAIS
        
        //3 toLowerCase()
        System.out.print(name.toLowerCase());//uvais

        //toLowerCase()
        System.out.println(name.toLowerCase());//uvais

        //charAt()

        System.out.println(name.charAt(3));//i
         
        //equals()
        String a="Denesh";
        String b="Denesh";
        System.out.println(a.equals(b));//true

           String c="Denesh";
        String d="Mathur";
        System.out.println(c.equals(d));//false


        //contains()
        String str="today i was learning java programming ";
        System.out.println(str.contains("java programming"));//true
        System.out.println(str.contains("python programming"));//false


        //concatenation()
        String u="Uvais";
        String v="Ansari";
        System.out.print(u+ " " + v);//Uvais Ansari


  
    }
}
