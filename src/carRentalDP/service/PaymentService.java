package carRentalDP.service;

import carRentalDP.Booking;
import carRentalDP.Payment;
import carRentalDP.PaymentStatus;
import carRentalDP.User;
import java.util.function.Consumer;

public class PaymentService implements  PaymentServiceInterface{

    public void chargeUser(User user, Booking booking, Consumer<Payment> callback){
        Payment payment= new Payment();
        payment.paymentStatus= PaymentStatus.COMPLETED;
        callback.accept(payment);
    }
}
