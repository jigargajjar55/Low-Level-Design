package LLDATM;

import java.util.Date;

public class Card {

    BankAccount account;
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    static int PIN_NUMBER = 112211;

    public boolean isCorrectPINEntered(int pin) {

        if (pin == PIN_NUMBER) {
            return true;
        }
        return false;
    }

    public int getBankBalance(){
        return account.balance;
    }

    public void deductBankBalance(int amount){
        account.withdrawalBalance(amount);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.account = bankAccount;
    }

}
