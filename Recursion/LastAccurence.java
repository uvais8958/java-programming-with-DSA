package Recursion;

/**
 * LastAccurence
 */
public class LastAccurence {

    public static int lastAccu(int arr[],int key,int index){
        //base case
        if(index==arr.length){
            return -1;
        }
        //recursive call
        int isFound=lastAccu(arr, key, index+1);
        //check while returning
        if(isFound==-1 && arr[index]==key){
            return index;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,4,10};
        int key=4;
        System.out.print("Last accurance:" + lastAccu(arr, key, 0));//Last accurance:4

    }
}