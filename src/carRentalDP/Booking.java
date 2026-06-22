package carRentalDP;


import java.time.LocalDate;
import java.util.UUID;

public class Booking {

    public UUID bookingId;
    public Vehicle vehicle;
    User user;
    public BookingStatus bookingStatus;
    public LocalDate startDate;
    public LocalDate endDate;
    public Payment payment;

    public Booking(User user ,Vehicle vehicle,LocalDate startDate,LocalDate endDate){
        this.user=user;
        this.vehicle=vehicle;
        this.bookingId=UUID.randomUUID();
        this.bookingStatus=BookingStatus.PENDING;
        this.startDate=startDate;
        this.endDate=endDate;


    }
}
