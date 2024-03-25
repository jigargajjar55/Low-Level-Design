package LLDInventoryManagementSystem.Warehouse;

import java.util.List;

public interface WarehouseSelectionStrategy {

    public Warehouse selectWarehouse(List<Warehouse> warehouseList);
}
