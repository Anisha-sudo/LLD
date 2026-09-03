package mediatorDP;

public class BidderImpl2 implements Bidder{
    int currVal;
    Mediator mediator;
    public BidderImpl2(Mediator mediator){
        this.mediator=mediator;
    }
    public void postBid(int bidAmt){
        System.out.println("Bid done by bidder2");
       mediator.receiveMsg(bidAmt);
    }
    public void receiveBid(int val){
        System.out.println("Bid received from mediator to bidder2 ::"+ val);
        this.currVal=val;
    }
}
