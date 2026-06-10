package stateDP_VendingMachine;

import stateDP_VendingMachine.StateImpl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){
    State state = new IdleState();
    Inventory inventory=new Inventory();
    VendingMachine vendingMachine= new VendingMachine(state,inventory);

    //Create items and add to inventory
        List<Item> itemList =new ArrayList<>();
        for(int i=0;i<=10;i++) {
        itemList.add(new Item(i, 10));
      }
      vendingMachine.addItem(itemList);

     //User will now enter item id:

        int requestedItemId =5;
        vendingMachine.getState().ShowItems(vendingMachine);
        vendingMachine.getState().confirmItem(vendingMachine);
        int amount=vendingMachine.getState().placeOrder(vendingMachine,5);
        vendingMachine.getState().clickOnPay(vendingMachine);
        vendingMachine.getState().acceptPayment(vendingMachine,amount);
        vendingMachine.getState().collectItem(vendingMachine);
        vendingMachine.getState().dispatchItem(vendingMachine);








    }
}
