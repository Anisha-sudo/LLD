package observerDP;

public class mail implements notification{
    Observable observable;
    mail(Observable obs){
        this.observable=obs;
    }

    public void update(){
        System.out.println("Sending mail...size is"+observable.getSize());

    }
}
