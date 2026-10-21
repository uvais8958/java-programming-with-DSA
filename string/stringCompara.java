package string;

/**
 * stringCompara
 */
public class stringCompara {

    public static void main(String args[]){
        String str1="Uvais";
        String str2="Uvais";
        String str3=new String ("Uvais");


        if(str1==str2){  //String is are equals
            System.out.println("String is are equals");
        }else{
            System.out.println("String is not equals");
        }
    
    if(str1==str3){//is not equals
        System.out.println("is equals");
    }
    else{
        System.out.println("is not equals");
    }


    if(str1.equals(str3)){//is equals
        System.out.println("is equals");
    }else{
        System.out.print("is not euals");
    }

    
    }

    


}