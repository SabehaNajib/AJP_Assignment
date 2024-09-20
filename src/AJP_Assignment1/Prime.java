package AJP_Assignment1;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        int i;
        boolean flag=false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if(num == 0 || num == 1){
            System.out.println("Prime Number");
        }

        for(i=2; i<=num/2; i++){

            if(num % i == 0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(num+" is not a Prime Number");
        }
        else{
            System.out.println(num+" is a Prime Number");
        }
    }
}
