package carRentalDP.service;

import carRentalDP.Booking;
import carRentalDP.User;

import java.time.LocalDate;
import java.util.UUID;

public interface BookingServiceInterface {
    public Booking createBooking(User user, UUID vehicleId, LocalDate startDate, LocalDate endDate);
    public void cancelBooking(UUID userID,UUID bookingId);
}
