package LLDVendingMachine;

public class Inventory {
    ItemShelf[] inventory;

    public Inventory(int itemCount) {

        this.inventory = new ItemShelf[10];
        initializeInventory();
    }

    

    private void initializeInventory() {

        int code = 101;
        int size = this.inventory.length;

        for (int i = 0; i < size; i++) {

            ItemShelf shelf = new ItemShelf();

            shelf.setShelfCode(code);
            // shelf.setSoldOut(true);

            this.inventory[i] = shelf;
            code++;

        }

    }

    public void addItem(Item item, int codeNumber) throws Exception {

        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getShelfCode() == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public ItemShelf getItemShelf(int codeNumber) throws Exception {

        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getShelfCode() == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {
                    System.out.println(itemShelf.getItem().getItemName());
                    return itemShelf;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber) {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getShelfCode() == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }

    public void displayInventory(){

        ItemShelf[] slots = this.inventory;
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getShelfCode() +
                    " Item: " + slots[i].getItem().getItemName() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }



    public ItemShelf[] getInventory() {
        return inventory;
    }



    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

}
