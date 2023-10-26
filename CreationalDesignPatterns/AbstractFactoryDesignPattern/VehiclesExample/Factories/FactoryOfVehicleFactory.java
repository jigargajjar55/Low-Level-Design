package AbstractFactoryDesignPattern.VehiclesExample.Factories;

public class FactoryOfVehicleFactory {

    public VehicleFactory getVehicleFactory(String factoryName){

        switch(factoryName){

            case "LuxaryVehicles": {
                return new LuxaryVehicleFactory();
            }
            case "OrdinaryVehicles" : {
                return new OrdinaryVehicleFactory();
            }
            default : {
                return null;
            }
        }
    }


    
}
