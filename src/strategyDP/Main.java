package strategyDP;
public class Main {
    public static void main(String[] args) {
     payment paymentObj=new upiPayment();
     payment paymentObj2=new bankPayment();
     shopping shop=new shopping(paymentObj2,100);
     shop.checkout();
    }
}