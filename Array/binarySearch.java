package Array;

public class binarySearch {

    public static int binaryS(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparision 
            if(numbers[mid]==key){//found
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=end-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
         int key=10;
         System.out.print("index of key at:"+binaryS(numbers,key));
    }
}


/*
Out put
index of key at:4

*/ 