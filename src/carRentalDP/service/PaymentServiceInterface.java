package carRentalDP.service;

import carRentalDP.Booking;
import carRentalDP.Payment;
import carRentalDP.User;
import java.util.function.Consumer;

public interface PaymentServiceInterface {
    public void chargeUser(User user, Booking booking, Consumer<Payment> callback);
}
