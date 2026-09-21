package pattern;

public class inverted_Rotated_pyramid {
    public static void inverted_pyaramid_rotated(int n){
        //outer
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
               
        }
        
    }
    
    public static void main(String args[]){

        inverted_pyaramid_rotated(4);
    }
}
