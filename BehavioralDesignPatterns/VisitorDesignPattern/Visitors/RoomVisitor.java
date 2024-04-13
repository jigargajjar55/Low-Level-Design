package VisitorDesignPattern.Visitors;

import VisitorDesignPattern.Elements.DeluxeRoom;
import VisitorDesignPattern.Elements.DoubleRoom;
import VisitorDesignPattern.Elements.SingleRoom;

public interface RoomVisitor {

    public void visit(SingleRoom obj);

    public void visit(DoubleRoom obj);

    public void visit(DeluxeRoom obj);
}
