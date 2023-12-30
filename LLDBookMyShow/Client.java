package LLDBookMyShow;

import LLDBookMyShow.Controller.BookMyShow;

public class Client {

    
    public static void main(String args[]) {

        BookMyShow bookMyShow = new BookMyShow();        

        // user1
        bookMyShow.createBooking("Bangalore", "BAAHUBALI");
        // user2
        bookMyShow.createBooking("Bangalore", "BAAHUBALI");

    }

    
}
