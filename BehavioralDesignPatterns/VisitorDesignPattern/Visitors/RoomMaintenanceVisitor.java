package VisitorDesignPattern.Visitors;

import VisitorDesignPattern.Elements.DeluxeRoom;
import VisitorDesignPattern.Elements.DoubleRoom;
import VisitorDesignPattern.Elements.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom obj) {

        System.out.println("Room is in maintenance!");
        
    }

    @Override
    public void visit(DoubleRoom obj) {
        System.out.println("Room is in maintenance!");
        
    }

    @Override
    public void visit(DeluxeRoom obj) {
        System.out.println("Room is in maintenance!");
        
    }
    
}
