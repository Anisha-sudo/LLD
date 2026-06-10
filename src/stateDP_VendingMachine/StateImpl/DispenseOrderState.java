package stateDP_VendingMachine.StateImpl;

import stateDP_VendingMachine.State;
import stateDP_VendingMachine.VendingMachine;

import static java.lang.Thread.sleep;

public class DispenseOrderState implements State {


    @Override
    public void ShowItems(VendingMachine machine){

    }
    @Override
    public void confirmItem(VendingMachine machine){

    }
    @Override
    public int placeOrder(VendingMachine machine, int itemId) {
     return 0;
    }
    @Override
    public void clickOnPay(VendingMachine machine){

    }
    @Override
    public void acceptPayment(VendingMachine machine, int amt) {

    }
    @Override
    public void collectItem(VendingMachine machine){

    }
    @Override
    public void dispatchItem(VendingMachine machine) {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("item dispatching....please collect....");
    }

    @Override
    public void cancelOrder(VendingMachine machine) {

    }

    @Override
    public void refund(VendingMachine machine) {

    }
}
