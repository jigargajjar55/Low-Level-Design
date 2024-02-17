package LLDATM;

public class BankAccount {
    int accountNumber;
    int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }

}