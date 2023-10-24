package AbstractFactoryDesignPattern.VehiclesExample.Vehicles;

public class Mercedes implements Vehicle{

    @Override
    public void average(){
     
        System.out.println("Mercedes Car is selected for test drive.");
        System.out.println("Mercedes average is 85!");
    }
    
}
