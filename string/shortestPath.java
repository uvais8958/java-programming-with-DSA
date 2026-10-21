package string;

/*
Given a route containg 4 direction (E,W,N,S) find the "Shortest" path to reach destination 
            "WNEESENNN"

*/ 


public class shortestPath {

    public static float getShortestPath(String path){

        int x=0,y=0;
        for(int i=0;i<=path.length()-1;i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            if(dir=='N'){
                y++;
            }
            //west
            if(dir=='W'){
                x--;
            }
            //east
            if(dir=='E'){
                x++;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2 +y2);
    }
    public static void main(String[]args){

        String path="WHEENESENNN";
      System.out.print(  getShortestPath(path));
    }
    
}
