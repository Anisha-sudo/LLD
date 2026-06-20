package carRentalDP.service;

import carRentalDP.Booking;
import carRentalDP.User;

public class PaymentService implements  PaymentServiceInterface{

    public Boolean chargeUser(User user, Booking booking){
        return true;
    }
}
