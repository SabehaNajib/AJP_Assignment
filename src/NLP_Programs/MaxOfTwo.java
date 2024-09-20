package NLP_Programs;

import java.util.Scanner;


public class MaxOfTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number : ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the Second number : ");
        double num2 = scanner.nextDouble();

        double max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number is : "+max);

        scanner.close();
    }
}
