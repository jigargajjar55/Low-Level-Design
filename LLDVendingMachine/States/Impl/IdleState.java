package LLDVendingMachine.States.Impl;

import LLDVendingMachine.VendingMachine;
import LLDVendingMachine.States.State;

public class IdleState extends State {

    @Override
    public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setCurrentState(new HasMoneyState());
    }

        
}
