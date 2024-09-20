package NLP_Programs;

public class Bank {
    private double amount;

    public Bank(double initialAmount){
        this.amount = initialAmount;
    }

    public void withdraw(double withdrawalAmount){
        String message = (amount >= withdrawalAmount) ? "Withdrawal Successful" : "Insufficient Amount";
        System.out.println(message);

        if(amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
        }
    }

    public void deposit(double depositAmount){
        amount += depositAmount;
        System.out.println("Deposit Successful");
    }

    public void displayBalance(){
        System.out.println("Total balance : "+amount);
    }

    public static void main(String[] args){
        Bank bank = new Bank(10000);

        bank.withdraw(20000);
        bank.deposit(60000);
        bank.displayBalance();
    }
}
