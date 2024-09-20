package AJP_Assignment1;
import java.util.Scanner;

public class sumOfnNumbers {
    public static void main(String[] args){
        int i;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number upto which you want sum : ");
        int num = scanner.nextInt();


        for(i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("Sum of first "+num+" Natural numbers = "+sum);
    }
}
