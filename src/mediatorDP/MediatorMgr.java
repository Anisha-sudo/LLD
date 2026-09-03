package mediatorDP;

import java.util.Arrays;

public class MediatorMgr {

    public static void main(String[] args) {

        Mediator mediator = new MediatorImpl();
        Bidder bidder1=new BidderImpl(mediator);
        Bidder bidder2=new BidderImpl2(mediator);
        mediator.setBidder(Arrays.asList(bidder2,bidder1));
        bidder1.postBid(5);
        bidder2.postBid(10);

    }


}
