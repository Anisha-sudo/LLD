package carRentalDP.service;

import carRentalDP.Booking;
import carRentalDP.User;

import java.util.UUID;

public interface BookingServiceInterface {
    public Booking createBooking(User user, UUID vehicleId);
    public void cancelBooking(UUID userID,UUID bookingId);
}
