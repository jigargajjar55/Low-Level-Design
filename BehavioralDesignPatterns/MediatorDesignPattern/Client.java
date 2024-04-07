package MediatorDesignPattern;

public class Client {
    
    public static void main(String[] args) {
        
        AuctionMediator auctionMediatorObj = new Auction();

        Colleague bidder1 = new Bider("A", auctionMediatorObj);
        Colleague bidder2 = new Bider("B", auctionMediatorObj);
        Colleague bidder3 = new Bider("C", auctionMediatorObj);

        bidder1.placeBid(100);
        bidder2.placeBid(200);
        
    }
}
