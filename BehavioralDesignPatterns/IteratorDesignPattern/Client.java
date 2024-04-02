package IteratorDesignPattern;

import java.util.*;

import IteratorDesignPattern.Aggregator.Library;
import IteratorDesignPattern.Iterator.Iterator;

public class Client {

    public static void main(String[] args) {

        List<Book> booksList = Arrays.asList(

                new Book(100, "Science"),
                new Book(200, "Maths"),
                new Book(300, "English"),
                new Book(400, "GK"),
                new Book(500, "Physics"));
        
        Library lib  = new Library(booksList);
        Iterator iterator = lib.createIterator();

        while(iterator.hasNext()){
            Book book = (Book)iterator.next();

            System.out.println(book.getBookName());

        }
    }
}
