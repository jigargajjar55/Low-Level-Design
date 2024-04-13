package VisitorDesignPattern.Elements;

import VisitorDesignPattern.Visitors.RoomVisitor;

public class SingleRoom implements RoomElement {

    public int roomPrice = 1000;

    @Override
    public void accept(RoomVisitor visitor) {
        
        visitor.visit(this);
        
    }
    
}
