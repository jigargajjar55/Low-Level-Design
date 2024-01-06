package LLDVendingMachine.States;

import LLDVendingMachine.VendingMachine;
import LLDVendingMachine.States.Impl.CancelState;

public abstract class State {

    public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not click on insert coin button in Current state");

    }

    public void insertCash(VendingMachine vendingMachine, double cash) throws Exception {
        throw new Exception("You can not insert Coin in Current state");
    }

    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not click on Start Product Selection button in Current state");
    }

    public void clickOnCancelButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not Cancel Order in Current state");

    }

    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("You can not choose Product in Current state");

    }

    public void clickOnConfirmButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not click on Confirm button in Current state");

    }

    public void refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not get refund Full Money in Current state");

    }

    public void checkingCash(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not check Money in Current state");

    }

}