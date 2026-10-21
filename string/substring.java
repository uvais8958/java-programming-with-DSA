package string;

/**
 * substring
 */
public class substring {

    public static String subString(String str,int si,int ei ){
        String substr="";
        for(int i=0;i<ei;i++){
             substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="HelloWorld";
        System.out.println(subString(str, 0, 5));//Hello
        System.out.println(str.substring(0,5));//Hello
         
    }
}