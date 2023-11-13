public class BankAccount {
    private static int totalAccounts = 0;

    private int accountNum;
    private int balance;

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public BankAccount(int firstDeposit) {
        this.accountNum = ++totalAccounts;
        this.balance = firstDeposit;
    }

    public int getAccountNumber() {
        return this.accountNum;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int deposit) {
        this.balance += deposit;
    }

    public void withdraw(int withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("Insufficient money in account");
        }
        else this.balance -= withdraw;
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
