package stateDP_VendingMachine.StateImpl;

import stateDP_VendingMachine.Inventory;
import stateDP_VendingMachine.State;
import stateDP_VendingMachine.VendingMachine;

public class IdleState implements State {

    @Override
    public void ShowItems(VendingMachine machine){
    Inventory inventory=machine.getInventory();
        inventory.getItems().forEach((key, ItemShelfStatusEnum ) -> {
            System.out.println("itemId: " + key + ", Status: " + ItemShelfStatusEnum);
        });
    }
    @Override
    public void confirmItem(VendingMachine machine){
        System.out.println("Item selection is confirm, proceeding with placing order");
        machine.setState(new ReceiveOrderState());
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

    }

    @Override
    public void cancelOrder(VendingMachine machine) {

    }

    @Override
    public void refund(VendingMachine machine) {

    }

}
