package FactoryMethodDesignPattern.LogisticsExample;

import java.util.Scanner;

import FactoryMethodDesignPattern.LogisticsExample.LogisticFactory.LogisticFactory;
import FactoryMethodDesignPattern.LogisticsExample.LogisticFactory.RoadLogistic;
import FactoryMethodDesignPattern.LogisticsExample.LogisticFactory.SeaLogistic;
import FactoryMethodDesignPattern.LogisticsExample.Transport.Transport;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LogisticFactory factory;

        try {

            System.out.println("Do you want to transport by road or sea?");
            String selectedMode = sc.nextLine();

            //System.out.println(selectedMode);

            if (selectedMode.equals("road")) {
                factory = new RoadLogistic();
            } else {
                factory = new SeaLogistic();
            }

            Transport transport = factory.createTransport();

            transport.deliver();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }

    }

}
