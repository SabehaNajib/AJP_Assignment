package ClassCodes;

public class ReverseNumberPattern {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=5-i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
