package demo.challenges78;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private long balance;

    public void deposit(long balance){
        this.balance += balance;
        System.out.println("Current balance in your Bank account is: " + this.balance);
    }
    public long withdraw (long withdrawAmount) {
        if(withdrawAmount <= 0 ){
            return balance;
        }else if (withdrawAmount > balance ) {
            balance = withdrawAmount - balance;
            balance = 0;
        } else {
            balance -= withdrawAmount;
        }
        return balance;
    }

    
    public BankAccount(long accountNumber, String accountHolderName, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Banking System");

        BankAccount bankAccount = new BankAccount(001, "Ashish Manna", 200000);
        bankAccount.deposit(1200);

        System.out.println(bankAccount.withdraw(200));
    }
}
