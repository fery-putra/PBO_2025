public class BankAccount {
    String accountNumber;
    String accountName;
    double balance;

    void showInfo(){
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: Rp" + String.format("%.2f", balance));

    }

    void deposit(double money){
        if(money > 0){
            balance += money;
            System.out.println( accountName + " Deposit Rp" + String.format("%.1f", money)+ " Current Balance : Rp" + String.format("%.1f", balance));
        }else{
            System.out.println("The deposit amount must be more than 0");
        }

    }

    void withdraw(double money){
        if(money > 0 && money <= balance){
            balance -= money;
            System.out.println( accountName + " Withdraw Rp" + String.format("%.1f", money)+ " (Success) Current Balance: Rp" + String.format("%.1f", balance));

        }else{
            System.out.println( accountName + " Withdraw Rp" + String.format("%.1f", money)+ " (Failed, Insufficient Balance) Current Balance: Rp" + String.format("%.1f", balance));

        }

    }
}
