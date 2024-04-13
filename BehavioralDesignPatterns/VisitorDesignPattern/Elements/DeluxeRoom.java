package VisitorDesignPattern.Elements;

import VisitorDesignPattern.Visitors.RoomVisitor;

public class DeluxeRoom implements RoomElement {

    public int roomPrice = 4000;

    @Override
    public void accept(RoomVisitor visitor) {

        visitor.visit(this);
       
    }
    
}
