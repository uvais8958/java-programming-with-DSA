package Array.Prectice;

/**
 * removeDuplicatesOpt
 */
public class removeDuplicatesOpt {

    public static int removDup(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
             if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
             }
        }
        return i+1;
    }
    public static void main(String args[]){
        int arr[]={10,10,20,20,30,30,40,40,50,50};
        int k=removDup(arr);
        System.out.println("Unique elements:"+k);

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    
}