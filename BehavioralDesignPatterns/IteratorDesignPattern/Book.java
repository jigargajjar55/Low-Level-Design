package IteratorDesignPattern;

public class Book {

    public int price;
    public String bookName;

    public Book(int price, String bookName) {
        this.price = price;
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    } 

    public String getBookName() {
        return bookName;
    }
}
