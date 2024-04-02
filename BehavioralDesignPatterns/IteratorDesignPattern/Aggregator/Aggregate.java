package IteratorDesignPattern.Aggregator;

import IteratorDesignPattern.Iterator.Iterator;

public interface Aggregate {
    
    public Iterator createIterator();
}
