package LLDVendingMachine;


import LLDVendingMachine.States.State;
import LLDVendingMachine.States.Impl.IdleState;

public class VendingMachine {

    State currentState;
    double insertedCash;
    Inventory inventory;
    ItemShelf selectedItemShelf;

    public VendingMachine(){
        currentState = new IdleState();
        inventory = new Inventory(10);
        insertedCash = 0;
    }

    public ItemShelf getSelectedItemShelf() {
        return selectedItemShelf;
    }

    public void setSelectedItemShelf(ItemShelf selectedItemShelf) {
        this.selectedItemShelf = selectedItemShelf;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public double getInsertedCash() {
        return insertedCash;
    }

    public void setInsertedCash(double insertedCash) {
        this.insertedCash = insertedCash;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    

    
    
    
}
