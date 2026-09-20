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



public static void primeInRange(int n){
    for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.print(i+" ");
        }
    }
     System.out.println();
}
//convert to binary to decimal
public static void bintoDec(int binNum){
   int myNum=binNum;
    int pow=0;
    int decNum=0;
    while(binNum>0){
        int lastDigit=binNum%10;
        decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;
    }
    System.out.print("decimal of " + myNum +" = " +decNum);
}

//convert to decimal to binary
public static void decToBinery(int n){
   int myNum=n;
    int pow=0;
    int binNum=0;
    while(n>0){
        int rem=n%2;
        binNum=binNum+(rem * (int)Math.pow(10,pow));
        pow++;
        n=n/2;
         
    }
    System.out.print("binary number form of="+myNum+"="+binNum);

}
public static void main (String args[]){
  // primeInRange(20);//2 3 5 7 9 11 13 17 19
   //bintoDec(1010);
   decToBinery(10);//1010
    // System.out.print(isPrime(12));//false

    }
    
}
