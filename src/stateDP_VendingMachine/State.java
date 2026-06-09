package stateDP_VendingMachine;

public interface State {

    public void acceptOrder(State state,Item item);
    public void acceptPayment(State state,int amt);
    public void dispatchItem(State state);
    public void cancelOrder(State state);
    public void refund(State state);

}
