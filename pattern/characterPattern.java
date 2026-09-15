package pattern;

/**
 * characterPattern
 */
public class characterPattern {

    public static void main(String args[]){
        int num=4;
        char ch='A';
        for(int line=1;line<=num;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
}


/*
output

A
BC
DEF
GHIJ


*/ 