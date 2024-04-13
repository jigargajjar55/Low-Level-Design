package VisitorDesignPattern.Visitors;

import VisitorDesignPattern.Elements.DeluxeRoom;
import VisitorDesignPattern.Elements.DoubleRoom;
import VisitorDesignPattern.Elements.SingleRoom;

public class RoomReserveVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom obj) {
        System.out.println("This room is reserved!");
    }

    @Override
    public void visit(DoubleRoom obj) {
        System.out.println("This room is reserved!");
    }

    @Override
    public void visit(DeluxeRoom obj) {
        System.out.println("This room is reserved!");
    }
    
}
