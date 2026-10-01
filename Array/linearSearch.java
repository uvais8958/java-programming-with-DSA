package Array;

class linearSearch {
   public static int linearSearch( int numbers[],int key){
    for(int i=1;i<=numbers.length;i++){
        if(numbers[i]==key){
            return i;
        }
    }
    return -1;
   }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8};
        int key=6;
      int index=  linearSearch(numbers, key);
      if(index ==-1){
        System.out.print("If not found");
      }else{
        System.out.print("key at this :"+ index);  //   key at this :5
      }

    }
}
