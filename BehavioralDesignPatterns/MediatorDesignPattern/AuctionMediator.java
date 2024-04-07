package MediatorDesignPattern;

public interface AuctionMediator {

    public void addBidder(Colleague bidder);

    public void placeBid(Colleague bidder, int bidAmount);
    
} 

