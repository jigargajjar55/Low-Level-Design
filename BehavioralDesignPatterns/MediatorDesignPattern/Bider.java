package MediatorDesignPattern;

public class Bider implements Colleague {

    String bidderName;
    AuctionMediator auctionMediator;

    public Bider(String bidderName, AuctionMediator auctionMediator) {
        this.bidderName = bidderName;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    public void placeBid(int bidAmount) {

        auctionMediator.placeBid(this, bidAmount);

    }

    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder: " + bidderName + " got the notification that someone has put bid of : " + bidAmount);
    }

    public String getName() {
        return bidderName;
    }

}
