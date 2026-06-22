package carRentalDP;

import carRentalDP.service.PaymentService;

import java.util.Date;
import java.util.UUID;

public class Booking {

    public UUID bookingId;
    public Vehicle vehicle;
    User user;
    public BookingStatus bookingStatus;
    public Date startDate;
    public Date endDate;
    public Payment payment;

    public Booking(User user ,Vehicle vehicle){
        this.user=user;
        this.vehicle=vehicle;
        this.bookingId=UUID.randomUUID();
        this.bookingStatus=BookingStatus.PENDING;
        this.startDate=new Date();
        this.endDate=new Date();


    }
}
