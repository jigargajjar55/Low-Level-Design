package LLDVendingMachine.States.Impl;

import LLDVendingMachine.VendingMachine;
import LLDVendingMachine.States.State;

public class HasMoneyState extends State {

    @Override
    public void insertCash(VendingMachine vendingMachine, double cash) throws Exception{

        vendingMachine.setInsertedCash(cash);

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setCurrentState(new ProductSelectionState());
    }

    @Override
    public void clickOnCancelButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setCurrentState(new CancelState());
        vendingMachine.getCurrentState().refundFullMoney(vendingMachine);

    }

}
