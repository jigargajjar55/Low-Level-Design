package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.Vehicles.*;

public class OrdinaryVehicleFactory implements VehicleFactory {

    String[] vehicleModels = { "Swift", "Hyundai" };

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
            case "Swift": {
                return new Swift();
            }

            case "Hyundai": {
                return new Hyundai();
            }
            default: {
                return null;
            }
        }
    }
}
