package Pattern;

public class DownRightTriangleStar {
    public static void main(String[] args){
        int rows = 5;

        for(int i=0; i<rows; i++){
            for(int j=i; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=rows-i; j<=rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
