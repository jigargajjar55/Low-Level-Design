package LLDATM.ATMStates;

import LLDATM.ATM;
import LLDATM.Card;

public class CheckBalanceState extends ATMState {

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Balance is: " + card.getBankBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        atm.setCurrentATMState(new ExitState(atm));
    }

}
