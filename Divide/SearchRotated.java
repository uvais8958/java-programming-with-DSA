package Divide;

/**
 * SearchRotated
 */
public class SearchRotated {
public static int search(int arr[],int target,int si,int ei){
    //base case
    if(si>ei){
        return -1;
    }
    //find mid
    int mid=si+(ei-si)/2;
    //case found
    if(arr[mid]==target){
        return mid;
    }
    //mid on Line 1
    if(arr[si]<=arr[mid]){
        //case a: left
        if(arr[si]<=target && target<=arr[mid]){
            return search(arr, target, si, mid-1);
        }else{
            return search(arr, target, mid+1, ei);
        }
    }
    //mid on Line 2
    else{
        //case b:right
        if(arr[mid]<=target && target<=arr[ei]){
            return search(arr, target, mid+1, ei);
        }
        else{
            return search(arr, target, si, mid-1);
        }
    }
}
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2,3};
        int target=0;//output 4
        int tarIndex=search(arr, target,0,arr.length-1);
        System.out.print("Search rotated index =>"+" "+tarIndex);
    }
}

/*
Search rotated index => 4

*/ 