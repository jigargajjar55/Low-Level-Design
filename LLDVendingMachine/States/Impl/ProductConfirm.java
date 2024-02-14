package LLDVendingMachine.States.Impl;

import LLDVendingMachine.VendingMachine;
import LLDVendingMachine.States.State;

public class ProductConfirm extends State {

    @Override
    public void checkingCash(VendingMachine vendingMachine) throws Exception{

        if (vendingMachine.getInsertedCash() < vendingMachine.getSelectedItemShelf().getItem().getPrice()) {

            System.out.println("Insufficient Amount, Product you selected is for price: "
                    + vendingMachine.getSelectedItemShelf().getItem().getPrice() + " and you paid: "
                    + vendingMachine.getInsertedCash());

            vendingMachine.setCurrentState(new CancelState(vendingMachine));

        

        } else {
            vendingMachine.getInventory().updateSoldOutItem(vendingMachine.getSelectedItemShelf().getShelfCode());
            productDispence(vendingMachine);
        }

    }

    private void productDispence(VendingMachine vendingMachine) throws Exception{

        double returnMoney = vendingMachine.getInsertedCash()
                - vendingMachine.getSelectedItemShelf().getItem().getPrice();

        if (returnMoney > 0) {
            System.out.println("Please collect your change: " + returnMoney);

        }

        System.out.println("Product Dispense!");
        System.out.println("Please collect your product from tray!");

        vendingMachine.setCurrentState(new IdleState());

    }

}
