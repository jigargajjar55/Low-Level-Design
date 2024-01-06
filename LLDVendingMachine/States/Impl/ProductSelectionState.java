package LLDVendingMachine.States.Impl;


import LLDVendingMachine.ItemShelf;
import LLDVendingMachine.VendingMachine;
import LLDVendingMachine.States.State;

public class ProductSelectionState extends State {

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {

        ItemShelf itemShelf = vendingMachine.getInventory().getItemShelf(productCode);

        vendingMachine.setSelectedItemShelf(itemShelf);

    }

    @Override
    public void clickOnConfirmButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setCurrentState(new ProductConfirm());
    }

    @Override
    public void clickOnCancelButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setCurrentState(new CancelState());

        vendingMachine.getCurrentState().refundFullMoney(vendingMachine);
    }

}
