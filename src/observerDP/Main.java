package observerDP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Observable cartobservable =new cartObservable();
        Observable stockobservable= new stockObservable();
        notification observer1=new phone(cartobservable);
        notification observer2= new mail(cartobservable);
        cartobservable.setObserverList(Arrays.asList(observer1,observer2));
//        stockobservable.setObserverList(Arrays.asList(observer1,observer2));
        cartobservable.update(10);
//        stockobservable.update(100);
    }
}
