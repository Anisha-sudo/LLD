package stateDP_VendingMachine;

public interface State {
    public void ShowItems(VendingMachine machine);
    public void confirmItem(VendingMachine machine);
    public int placeOrder(VendingMachine machine, int itemId);
    public void clickOnPay(VendingMachine machine);
    public void acceptPayment(VendingMachine machine,int amt);
    public void collectItem(VendingMachine machine);
    public void dispatchItem(VendingMachine machine);
    public void cancelOrder(VendingMachine machine);
    public void refund(VendingMachine machine);
}
