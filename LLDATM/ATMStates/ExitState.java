package LLDATM.ATMStates;

import LLDATM.ATM;

public class ExitState extends ATMState {

    public ExitState(ATM atm) {
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {

        System.out.println("Please collect your card");
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens!");
    }

}
