package VisitorDesignPattern.Elements;

import VisitorDesignPattern.Visitors.RoomVisitor;

public class DoubleRoom implements RoomElement {

    public int roomPrice = 2000;

    @Override
    public void accept(RoomVisitor visitor) {

        visitor.visit(this);
        
    }
    
}
