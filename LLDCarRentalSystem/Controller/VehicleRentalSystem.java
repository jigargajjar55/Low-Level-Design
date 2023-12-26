package LLDCarRentalSystem.Controller;

import java.util.List;

import LLDCarRentalSystem.Model.Location;
import LLDCarRentalSystem.Model.User;
import LLDCarRentalSystem.Model.Store.Store;

public class VehicleRentalSystem {

    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> stores, List<User> users) {

        this.storeList = stores;
        this.userList = users;
    }

    public Store getStore(Location location) {

        // based on location, we will filter out the Store from storeList.
        return storeList.get(0);
    }

    // addUsers

    // remove users

    // add stores

    // remove stores

}
