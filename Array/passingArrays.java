package Array;

/**
 * passingArrays
 */
public class passingArrays {

    public static void updateMarks(int marks[],int nochange){
        nochange=10;  
        for(int i=0;i<marks.length;i++){
                marks[i]=marks[i]+1;
                 nochange=10;  
            }
    }
    public static void main(String args[]){
        int marks[]={96,97,99};
        int nochange=5;
        updateMarks(marks,nochange);
        System.out.println(nochange);

        //print marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
}