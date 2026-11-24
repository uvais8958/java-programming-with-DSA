package Array.Prectice;

import java.util.HashSet;

public class removeDuplicates {
    public static int removeDup(int arr[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int index=0;
        for(int num :set ){
            arr[index]=num;
            index++;
        }
        return index;
    }
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4,4,5,5,};
    
        int k=removeDup(arr);
        System.out.println("unique elements:"+k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    
}

/*
Time complexity O(n) average
Space Complexity O(n)


*/ 
