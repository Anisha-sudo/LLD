package observerDP;

import java.util.List;

public class cartObservable implements Observable{
    int cartSize=0;
    List<notification> observerList;

    public void setObserverList(List<notification> observerList){
        this.observerList=observerList;
    }

    public int getSize(){
        return cartSize;
    }


    public void update(int val){
        cartSize=cartSize+val;
        if(cartSize>=10){
            notifyObservers();
        }

    }
    void notifyObservers(){
        for(int i=0;i<observerList.size();i++){
            observerList.get(i).update();
        }
    }
}
