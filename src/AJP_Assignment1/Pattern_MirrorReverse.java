package AJP_Assignment1;

public class Pattern_MirrorReverse {
    public static void main(String[] args){
        int rows = 3;

        for(int i=rows; i>=1; i--){
            for(int j=0; j<rows-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
