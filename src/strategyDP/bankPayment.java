package strategyDP;

public class bankPayment implements payment{
    double charges;
     public void pay(int amount){
         charges=amount *0.1;
        System.out.println("Bank payment charge is :"+charges);
     }
}
