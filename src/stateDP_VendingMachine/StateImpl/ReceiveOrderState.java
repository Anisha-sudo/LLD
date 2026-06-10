package stateDP_VendingMachine.StateImpl;

import stateDP_VendingMachine.State;
import stateDP_VendingMachine.VendingMachine;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class ReceiveOrderState implements State {
    @Override
    public int placeOrder(VendingMachine machine, int itemId) {
        try {
            sleep(500);
            System.out.println("received Order for item with id  "+itemId);
        }catch (Exception e){
            System.out.println("exception occurred");
            currentThread().interrupt();
        }
        return machine.getInventory().getCost(itemId);
    }

    @Override
    public void ShowItems(VendingMachine machine) {

    }

    @Override
    public void confirmItem(VendingMachine machine){

    }
    @Override
    public void clickOnPay(VendingMachine machine){
      machine.setState(new ReceivePaymentState());
    }
    @Override
    public void acceptPayment(VendingMachine machine, int amt) {

    }
    @Override
    public void collectItem(VendingMachine machine){

    }
    @Override
    public void dispatchItem(VendingMachine machine) {

    }

    @Override
    public void cancelOrder(VendingMachine machine) {

    }

    @Override
    public void refund(VendingMachine machine) {

    }
}
