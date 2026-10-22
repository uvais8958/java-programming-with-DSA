package string.prectice;

/**
 * prectice
 */
public class prectice {

    // public static String sbString(String str,int si,int ei){
    //     String subString="";
    //     for(int i=si;i<ei;i++){
    //         subString+=str.charAt(i);
    //     }
    //     return subString;
    // }

    // public static void main(String args[]){
    //     String str="HelloWorld";
    //     System.out.print(sbString(str,0,5));

    // }


public static float getShortestPath(String path){
    int x=0;
    int y=0;
    for(int i=0;i<path.length();i++){
        char dir=path.charAt(i);
        if(dir=='S'){
        y--;
        }
        if(dir=='N'){
            y++;
        }
        if(dir=='W'){
            x--;
        }
        if(dir=='E'){
            x++;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
}
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.print(getShortestPath(path));//5.0

    }
}