package stateDP_VendingMachine;

import java.util.List;

public class VendingMachine {
    State state ;
    Inventory inventory;
    public VendingMachine(State state,Inventory inventory){
        this.state=state;
        this.inventory=inventory;
    }

    public void addItem(List<Item> itemList){
        inventory.addItems(itemList);
    }

    public State getState(){
        return this.state;
    }
    public void setState(State state){
        this.state=state;
    }
    public Inventory getInventory(){
        return this.inventory;
    }

}
