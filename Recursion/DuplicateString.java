package Recursion;

/**
 * DuplicateString
 */
public class DuplicateString {

    public static void removeDuplica(String str,int index,StringBuilder newStr,boolean map[]){
        //Base case
        if(index==str.length()){
            System.out.print(newStr);
            return ;
        }
        char currentChar=str.charAt(index);
        //already exist character
        if(map[currentChar-'a']==true){
         removeDuplica(str, index+1, newStr, map);
        }else{
            if(map[currentChar-'a']=true){
                newStr.append(currentChar);//add 
                removeDuplica(str, index, newStr, map);
            }
        }
    }
    public static void main(String args[]){
        String str="abbbbccdeeeffgghh";
    removeDuplica(str,0,new StringBuilder(""),new boolean[26]);
    }
}