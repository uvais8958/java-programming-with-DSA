//Day- 03/october/2026

package prectice_questions;

/**
 
patterns-prectice
  
 */


/*
Q 1:
print star pettern

*/ 
// public class patterns {
//   public static void main(String args[]){
//     for(int line=1;line<=4;line++){
//         for(int star=1;star<=line;star++){
//           System.out.print("*");
//         }
//         System.out.println();
//     }
//   }
    
// }


/*

output

*
**
***
****

*/ 


/*
Q 2:

print Inverted star pattern
****
***
**
*

*/ 

/**
 * patterns
 */
// public class patterns {

//     public static void main(String args[]){
//         int n=4;
//         for(int line=1;line<=n;line++){
//             for(int j=1;j<=n-line+1;j++){
//                 System.out.print("*");
//             }
//          System.out.println();
//         }
      
//     }
// }


/*
output

****
***
**
*

*/





/*


Q 3
Half payramid pattern

1
12
123
1234

*/ 



// public class patterns {

//     public static void main(String args[]){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



/*

out put

1
12
123
1234

*/ 


/**
 * patterns characters
 */
public class patterns {

    public static void main(String args[]){
          int num=4;
          char ch='A';
          for(int line=1;line<=num;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
          }
    }
}

/*

out put

A 
B C 
D E F 
G H I J 

*/   