package LLDVendingMachine;

import LLDVendingMachine.States.State;

public class Client1 {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        try {

            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            vendingMachine.getInventory().displayInventory();

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            vendingMachine.getCurrentState().pressInsertCashButton(vendingMachine);

            vendingMachine.getCurrentState().insertCash(vendingMachine, 35);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendingMachine.getCurrentState().clickOnStartProductSelectionButton(vendingMachine);

            vendingMachine.getCurrentState().chooseProduct(vendingMachine, 102);

            vendingMachine.getCurrentState().clickOnConfirmButton(vendingMachine);

            // vendingMachine.getCurrentState().clickOnCancelButton(vendingMachine);

            vendingMachine.getCurrentState().checkingCash(vendingMachine);

            vendingMachine.getInventory().displayInventory();

        } catch (Exception e) {
            System.out.println(e);
            // vendingMachine.getInventory().displayInventory();
        }

    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        Inventory inventory = vendingMachine.getInventory();
        ItemShelf[] slots = inventory.getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if (i >= 0 && i < 3) {
                newItem.setItemName("Coke");
                newItem.setPrice(12);
            } else if (i >= 3 && i < 5) {
                newItem.setItemName("PEPSI");
                newItem.setPrice(9);
            } else if (i >= 5 && i < 7) {
                newItem.setItemName("JUICE");
                newItem.setPrice(13);
            } else if (i >= 7 && i < 10) {
                newItem.setItemName("SODA");
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }

        inventory.setInventory(slots);
    }

}
