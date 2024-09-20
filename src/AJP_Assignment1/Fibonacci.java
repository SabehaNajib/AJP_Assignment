package AJP_Assignment1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number upto which Fibonacci terms to generate: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci Sequence : ");

        int first=0, second=1;

        for(int i=1; i<=num; i++){
            System.out.print(first+" ");

            int temp = first + second;
            first = second;
            second = temp;
        }

    }
}
