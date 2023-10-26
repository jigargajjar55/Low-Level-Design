package AbstractFactoryDesignPattern.VehiclesExample.Vehicles;

public class BMW implements Vehicle {

    @Override
    public void average(){
        System.out.println("BMW Car is selected for test drive.");
        System.out.println("BMW average is 60!");
    }
    
}
