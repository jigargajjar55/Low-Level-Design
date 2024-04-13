package VisitorDesignPattern;

import VisitorDesignPattern.Elements.DeluxeRoom;
import VisitorDesignPattern.Elements.DoubleRoom;
import VisitorDesignPattern.Elements.RoomElement;
import VisitorDesignPattern.Elements.SingleRoom;
import VisitorDesignPattern.Visitors.RoomMaintenanceVisitor;
import VisitorDesignPattern.Visitors.RoomPricingVisitor;
import VisitorDesignPattern.Visitors.RoomReserveVisitor;
import VisitorDesignPattern.Visitors.RoomVisitor;

public class Client {
    
    public static void main(String[] args) {
        
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();

        System.out.println("================================");

        RoomVisitor pricingVisitor = new RoomPricingVisitor();

        singleRoom.accept(pricingVisitor);
        doubleRoom.accept(pricingVisitor);
        deluxeRoom.accept(pricingVisitor);
        System.out.println("================================");

        RoomVisitor maintainVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(maintainVisitor);
        doubleRoom.accept(maintainVisitor);
        deluxeRoom.accept(maintainVisitor);

        System.out.println("================================");

        RoomVisitor reserveVisitor = new RoomReserveVisitor();
        singleRoom.accept(reserveVisitor);
        doubleRoom.accept(reserveVisitor);
        deluxeRoom.accept(reserveVisitor);

    }
}
