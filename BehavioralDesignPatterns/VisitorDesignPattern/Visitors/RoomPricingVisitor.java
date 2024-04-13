package VisitorDesignPattern.Visitors;

import VisitorDesignPattern.Elements.DeluxeRoom;
import VisitorDesignPattern.Elements.DoubleRoom;
import VisitorDesignPattern.Elements.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom obj) {

        System.out.println("Price of Single room is: " + obj.roomPrice);

    }

    @Override
    public void visit(DoubleRoom obj) {
        System.out.println("Price of Double room is: " + obj.roomPrice);

    }

    @Override
    public void visit(DeluxeRoom obj) {

        System.out.println("Price of Deluxe room is: " + obj.roomPrice);

    }

}
