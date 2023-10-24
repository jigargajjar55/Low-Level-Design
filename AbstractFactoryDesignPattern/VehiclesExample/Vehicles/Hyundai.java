package AbstractFactoryDesignPattern.VehiclesExample.Vehicles;

public class Hyundai implements Vehicle {

    @Override
    public void average(){
        
        System.out.println("Hyundai Car is selected for test drive.");
        System.out.println("Hyundai average is 50!");
    }
    
}
