package AJP_Assignment1;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if(num%2 == 0){
            System.out.println(num+" is Even number");
        }
        else{
            System.out.println(num+" is Odd number");
        }
    }
}
