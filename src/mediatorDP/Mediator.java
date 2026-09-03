package mediatorDP;

import java.util.List;

public interface Mediator {
    void sendMsg();
    void receiveMsg(int val);
    void setBidder(List<Bidder> bidderList);

}
