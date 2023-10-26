package AbstractFactoryDesignPattern.VehiclesExample.Factories;

import AbstractFactoryDesignPattern.VehiclesExample.Vehicles.*;

public class LuxaryVehicleFactory implements VehicleFactory {

    String[] vehicleModels = { "Mercedes", "BMW" };

    @Override
    public void getListOfVehicles() {

        int n = vehicleModels.length;

        for (int ptr = 0; ptr < n; ptr++) {
            System.out.println((ptr + 1) + ") " + vehicleModels[ptr]);
        }

    }

    @Override
    public Vehicle getVehicle(String vehString) {

        switch (vehString) {

            case "Mercedes": {
                return new Mercedes();
            }
            case "BMW": {
                return new BMW();
            }
            default: {
                return null;
            }
        }
    }

}
