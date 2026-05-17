package observerDP;

import java.util.List;

public class stockObservable implements Observable {
    int stockSize=0;
    List<notification> observerList;
    public void setObserverList(List<notification> observerList){
        this.observerList=observerList;
    }

    public int getSize(){
        return stockSize;
    }
    public void update(int val){
        stockSize=stockSize+val;
        if(stockSize>=100){
            notifyObservers();
        }
    }
    void notifyObservers(){
        for(notification obs:observerList){
            obs.update();
        }
    }
}
