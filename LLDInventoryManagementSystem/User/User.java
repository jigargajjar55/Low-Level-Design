package LLDInventoryManagementSystem.User;

import java.util.ArrayList;
import java.util.List;

import LLDInventoryManagementSystem.Address.Address;

public class User {

    public int userId;
    public String userName;
    public Address address;
    Cart userCartDetails;
    List<Integer> orderIds;

    public User(){
        userCartDetails = new Cart();
        orderIds = new ArrayList<>();
    }

    //get UserCart
    public Cart getUserCart(){
        return userCartDetails;
    }
}
