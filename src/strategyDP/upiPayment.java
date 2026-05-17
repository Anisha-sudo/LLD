package strategyDP;

public class upiPayment implements payment {
    double charges;

    public void pay(int amount){
        charges= amount*0.2;
        System.out.println("UPI payment charges are :"+charges);
    }

}
