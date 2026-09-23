package pattern;

/**
 * solidRhombus
 */
public class solidRhombus {

    public static void solid_rhambus(int n){
        for(int i=1;i<=n;i++){
            //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=n;j++){
        System.out.print("*");
        }
        System.out.println();
        }
    }
    public static void main(String args[]){

    solid_rhambus(8);
    }
}


/*
output


      ********
     ********
    ********
   ********
  ********
 ********
********

*/ 