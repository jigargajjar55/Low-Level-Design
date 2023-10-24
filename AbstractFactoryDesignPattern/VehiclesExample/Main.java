package AbstractFactoryDesignPattern.VehiclesExample;

import java.util.Scanner;

import AbstractFactoryDesignPattern.VehiclesExample.Factories.FactoryOfVehicleFactory;
import AbstractFactoryDesignPattern.VehiclesExample.Factories.VehicleFactory;
import AbstractFactoryDesignPattern.VehiclesExample.Vehicles.Vehicle;


//Abstract Factory Pattern

/*

It is a Factory of factories.
 
When we have different types of products or different factories,
we can use Abstract Factory Design pattern to group such factories.


 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FactoryOfVehicleFactory factVF = new FactoryOfVehicleFactory();

            System.out.println("We have variety of Vehicles");
            System.out.println("1) LuxaryVehicles");
            System.out.println("2) OrdinaryVehicles");
            System.out.println("Please select options");

            String selectedOption = sc.nextLine();

            VehicleFactory vehicleFactObj = factVF.getVehicleFactory(selectedOption);

            System.out.println("We have variety of Vehicles");
            vehicleFactObj.getListOfVehicles();
            System.out.println("Please select options");

            String selectedVehicle = sc.nextLine();

            Vehicle selectedVehicleObj = vehicleFactObj.getVehicle(selectedVehicle);

            selectedVehicleObj.average();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }

    }

}
