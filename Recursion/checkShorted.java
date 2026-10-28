package Recursion;

/**
 * checkShorted
 */
public class checkShorted {

    public static boolean checkSh(int arr[],int index){
       //base case
        if(index==arr.length-1){
          return true;
        }
        //check current pair
        if(arr[index]>arr[index+1]){
            return false;
        }
        return  checkSh(arr, index+1);
    }
    public static void main(String args[]){
  //  int arr[]={1,2,3,4,5,6};
//    System.out.print("check Shorted element="+checkSh(arr, 0));//check Shorted element=true
    int arr[]={2,1,3,4,51};
    System.out.print("Check shorted element " +checkSh(arr, 0));//Check shorted element false
}
}