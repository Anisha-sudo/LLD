package carRentalDP.service;

import carRentalDP.Booking;
import carRentalDP.User;

public interface PaymentServiceInterface {
    public Boolean chargeUser(User user, Booking booking);
}
