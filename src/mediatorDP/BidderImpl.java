package mediatorDP;

public class BidderImpl  implements Bidder{
    int currVal;
    Mediator mediator;
    public BidderImpl(Mediator mediator){
        this.mediator=mediator;
    }
    public void postBid(int bidAmt){
        System.out.println("Bid done by bidder1 ");
        mediator.receiveMsg(bidAmt);
    }
    public void receiveBid(int val){
        System.out.println("Bid received from mediator to bidder1::"+ val);
        this.currVal=val;
    }
}
