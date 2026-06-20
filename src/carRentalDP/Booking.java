package carRentalDP;

import java.util.UUID;

public class Booking {

    public UUID bookingId;
    public Vehicle vehicle;
    User user;
    public BookingStatus bookingStatus;

    public Booking(User user ,Vehicle vehicle){
        this.user=user;
        this.vehicle=vehicle;
        this.bookingId=UUID.randomUUID();
        this.bookingStatus=BookingStatus.PENDING;
    }
}
