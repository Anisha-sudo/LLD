package carRentalDP.service;

import carRentalDP.User;

import java.util.UUID;

public interface BookingServiceInterface {
    public void createBooking(User user, UUID vehicleId);
    public void cancelBooking(UUID userID,UUID bookingId);
}
