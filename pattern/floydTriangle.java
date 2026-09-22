package pattern;

/**
 * floyd'sTriangle
 */
public class floydTriangle {
    public static void floyd_triangel(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
            counter++;
            }
            System.out.println();
        }
    }
public static void main(String args[]){
    floyd_triangel(4);
    
}
    
}

/*
output
1
2 3
4 5 6
7 8 9 10


*/ 