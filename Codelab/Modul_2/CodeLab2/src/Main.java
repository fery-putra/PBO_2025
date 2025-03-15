public class Main {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount();
        BankAccount account2=new BankAccount();

        account1.accountNumber ="08560013";
        account1.accountName ="Fery";
        account1.balance =100000;

        account2.accountNumber ="08560426";
        account2.accountName ="Fera";
        account2.balance =100000;

        account1.showInfo();
        account2.showInfo();

        System.out.println();
        account1.deposit(300000);
        account2.deposit(200000);
        System.out.println();
        account1.withdraw(200000);
        account2.withdraw(400000);

        account1.showInfo();
        account2.showInfo();
    }
}