package VisitorDesignPattern.Elements;

import VisitorDesignPattern.Visitors.RoomVisitor;

public interface RoomElement {

    public void accept(RoomVisitor visitor);
    
}
