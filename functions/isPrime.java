package functions;

public class isPrime {
   
//    //if only n>=2
//     public static boolean isPrime(int n){
//     //boolean isPrime=true;
//     //corner case
//     if(n==2){
//         return true;
//     }


//     for(int i=2;i<=n-1;i++){
//         if(n%i==0){//completed devided
//            return  false;
           
//             //isPrime=false
//             // //       break;
//         }
//     }
//     return true;
//    // return isPrime;
//    }
   
//optimized solution 

public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            return false;
            
        }
        
    }
    return  true;
}
public static void main (String args[]){
        System.out.print(isPrime(12));//false

    }
    
}
