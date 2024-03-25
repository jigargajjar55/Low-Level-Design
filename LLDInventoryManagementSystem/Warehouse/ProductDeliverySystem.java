package LLDInventoryManagementSystem.Warehouse;

import java.util.List;

import LLDInventoryManagementSystem.Order.Order;
import LLDInventoryManagementSystem.Order.OrderController;
import LLDInventoryManagementSystem.Product.ProductCategory;
import LLDInventoryManagementSystem.User.Cart;
import LLDInventoryManagementSystem.User.User;
import LLDInventoryManagementSystem.User.UserController;

public class ProductDeliverySystem {

    UserController userController;
    WarehouseController warehouseController;
    OrderController orderController;

    public ProductDeliverySystem(List<User> userList, List<Warehouse> warehouseList){
        userController = new UserController(userList);
        warehouseController = new WarehouseController(warehouseList , null);
        orderController = new OrderController();
    }

    //get user object
    public User getUser(int userId){
        return userController.getUser(userId);
    }

    //get warehouse
    public Warehouse getWarehouse(WarehouseSelectionStrategy warehouseSelectionStrategy){
        return warehouseController.selectWarehouse(warehouseSelectionStrategy);

    }

    //get inventory
    public Inventory getInventory(Warehouse warehouse){
        return warehouse.inventory;

    }

    //add product to cart
    public void addProductToCart(User user, ProductCategory product, int count){
        Cart cart = user.getUserCart();
        cart.addItemInCart(product.productCategoryId, count);
    }

    //place order
    public Order placeOrder(User user, Warehouse warehouse){
        return orderController.createNewOrder(user, warehouse);
    }

    public void checkout(Order order){
        order.checkout();
    }

}
