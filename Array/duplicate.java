
/*
Given an integer array nums,return true if any values appears at least twice in the array,and 
return false if every elements is distinct...

example:
input:[1,2,3,4,1]
output:true

input:[1,2,3,4]
output:flase

*/ 


public class duplicate {
    public static boolean duplicateArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        } 
        return false;

    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,1,2};
        System.out.print(duplicateArray(nums));
    }
}


/*
output

true

*/  