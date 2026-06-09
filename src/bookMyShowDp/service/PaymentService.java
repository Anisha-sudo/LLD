package bookMyShowDp.service;

import bookMyShowDp.Payment;
import bookMyShowDp.Seat;

import java.util.List;

public class PaymentService {
    Payment payment;
    public Payment makePayment(List<Integer> seatList){
        return this.payment=new Payment(123,"SUCCESS");
    }
}
