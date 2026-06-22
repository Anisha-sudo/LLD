package carRentalDP.service;

import carRentalDP.Booking;
import carRentalDP.Payment;
import carRentalDP.User;

import java.time.LocalDate;
import java.util.function.Consumer;

public interface PaymentServiceInterface {
    public void chargeUser(User user, Booking booking, LocalDate startDate, LocalDate endDate, Consumer<Payment> callback);
}
