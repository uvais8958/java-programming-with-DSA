package Array;
//print a subArray
public class subArray {

    public static void subArray(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            tp++;
            }


            System.out.println();
        }
        System.out.print("Total numbers of pairs:"+tp);

    }
     public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        
        subArray(numbers);
     }    
}


/*

output

2            
2 4            
2 4 6      
2 4 6 8 
2 4 6 8 10             =5

4 
4 6 
4 6 8 
4 6 8 10               =4

6 
6 8 
6 8 10                 =3

8 
8 10                   =2

10                     =1  


formula total numbers of pairs:  n=(n+1)/2
Total numbers of pairs:15


*/
 