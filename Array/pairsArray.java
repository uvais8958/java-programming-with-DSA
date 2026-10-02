package Array;

//pairs in an array

public class pairsArray {
    public static void pairsArr(int numbers[]){
        int tp=0;
         for(int i=0;i<numbers.length;i++){
            int current=numbers[i];//2,4,6,8,10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current + ","+numbers[j]+")");
                tp++;
            }
           System.out.println();
         }
          System.out.print("Total numbers of pairs:"+tp);

    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        pairsArr(numbers);

    }
}


/*
output

(2,4)(2,6)(2,8)(2,10) =4
(4,6)(4,8)(4,10)      =3
(6,8)(6,10)           =2    
(8,10)                =1

Total numbers of pairs:10





*/ 