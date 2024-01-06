package LLDVendingMachine;

public class ItemShelf {

    Item item;
    int shelfCode;
    int quantity;
    boolean soldOut;

    
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getShelfCode() {
        return shelfCode;
    }
    public void setShelfCode(int shelfCode) {
        this.shelfCode = shelfCode;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean isSoldOut() {
        return soldOut;
    }
    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
    
   
    


    
}
