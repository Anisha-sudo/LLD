package observerDP;

public class phone implements notification{
    Observable observable;
    phone(Observable observable){
        this.observable=observable;
    }


    public void update(){
        System.out.println("Sending phone Message...size is"+observable.getSize());
    }
}
