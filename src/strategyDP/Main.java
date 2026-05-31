package strategyDP;
public class Main {
    public static void main(String[] args) {
     payment upiPaymentObj=new upiPayment();
     payment BankPaymentObj=new bankPayment();
     shopping shop=new shopping(BankPaymentObj,100);
     shop.checkout();
     shopping shop2=new shopping(upiPaymentObj,100);
     shop2.checkout();
    }
}