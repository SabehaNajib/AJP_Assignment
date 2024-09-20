package AJP_Assignment1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to find Factorial : ");
        int num = scanner.nextInt();
        scanner.close();

        int fact=1;
        if(num==0 || num==1){
            fact = 1;
        }
        while(num>=1){
            fact *= num;
            num--;
        }
        System.out.println("Factorial is : "+fact);
    }
}
