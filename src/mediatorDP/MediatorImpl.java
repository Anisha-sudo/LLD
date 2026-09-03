package mediatorDP;

import java.util.List;

public class MediatorImpl implements Mediator{
    List<Bidder>bidderList;
    int bidVal;
    public void sendMsg(){
     for(Bidder bidder:bidderList){
         bidder.receiveBid(bidVal);
     }
    }
    public void receiveMsg(int val){
       bidVal=val;
       sendMsg();
    }
    public void setBidder(List<Bidder> bidderList){
        this.bidderList=bidderList;
    }

}
