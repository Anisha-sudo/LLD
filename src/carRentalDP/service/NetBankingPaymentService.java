package carRentalDP.service;
import carRentalDP.Booking;
import carRentalDP.Payment;
import carRentalDP.PaymentStatus;
import carRentalDP.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;

public class NetBankingPaymentService implements PaymentServiceInterface {

    @Override
    public void chargeUser(User user, Booking booking, LocalDate startDate, LocalDate endDate, Consumer<Payment> callback) {
        int amount= (int) ChronoUnit.DAYS.between(startDate,endDate)*100+60;
        Payment payment= new Payment(amount);
        payment.paymentStatus= PaymentStatus.COMPLETED;
        callback.accept(payment);
    }
}
