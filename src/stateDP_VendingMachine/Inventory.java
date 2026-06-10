package stateDP_VendingMachine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    Map<Item,ItemShelfStatusEnum> itemList=new HashMap<>();

    public void addItems(List<Item> itemsList){
        itemsList.forEach(i->{
            itemList.put(i,ItemShelfStatusEnum.available);
        });
    }
    public   Map<Item,ItemShelfStatusEnum> getItems(){
        return itemList;
    }

    public int getCost(int itemId){
        int cost=0;
        for (Map.Entry<Item, ItemShelfStatusEnum> entry : itemList.entrySet()) {
           Item item =entry.getKey();
           ItemShelfStatusEnum val= entry.getValue();
           if(item.itemId==itemId){
               cost=item.itemId;
           }
        }
        return cost;
    }
}
