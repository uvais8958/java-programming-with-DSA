package Recursion;

/**
 * firstAccurance
 */
public class firstAccurance {

    public static int firstAcc(int arr[],int key,int i){
        //Base case
        if(i==arr.length-1){
            return -1;
        }
        //check current element
        if(i==key){
            return i;
        }
        //recursive call
        return firstAcc(arr, key, i+1);

    }
    public static void main(String arhs[]){
        int arr[]={8,2,6,9,5,10,7};
        int key=5;
        int result=firstAcc(arr, key, 0);
        System.out.print(result);//5

    }
}