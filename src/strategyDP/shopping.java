package strategyDP;

public class shopping {

    payment paymentObj;
    int cost;
    public shopping(payment obj,int cost){
        this.paymentObj=obj;
        this.cost=cost;

    }
    public void checkout(){
        paymentObj.pay(cost);

    }
}
