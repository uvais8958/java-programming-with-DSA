package pattern;
/**
 * holleRactangle
 */
public class holleRactangle {

    public static void hollw_RactPattern(int totRow,int totCols){
        //outer loop
        for(int i=1;i<=totRow;i++){
            //inner loop
            for(int j=1;j<=totCols;j++){
                //celle (i,j)

                if(i==1||i==totRow || j==1||j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
          hollw_RactPattern(4, 5);
    }
}


/*


output


*****
*   *
*   *
*****

*/ 