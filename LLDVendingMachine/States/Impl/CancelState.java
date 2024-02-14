package LLDVendingMachine.States.Impl;

import LLDVendingMachine.VendingMachine;
import LLDVendingMachine.States.State;

public class CancelState extends State {

    VendingMachine vendingMachine;

    public CancelState(VendingMachine vendingMachine) throws Exception {
        this.vendingMachine = vendingMachine;

        refundFullMoney(vendingMachine);
    }

    @Override
    public void refundFullMoney(VendingMachine vendingMachine) throws Exception {

        System.out.println("You will get All inserted money back!");

        vendingMachine.setInsertedCash(0);

        vendingMachine.setCurrentState(new IdleState());

        throw new Exception("Please collect all your Money!");

    }

}
