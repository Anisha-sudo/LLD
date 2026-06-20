package carRentalDP.Controller;

import carRentalDP.Booking;
import carRentalDP.User;
import carRentalDP.service.BookingService;
import carRentalDP.service.BookingServiceInterface;
import carRentalDP.service.StoreService;

import java.util.UUID;

public class BookingController {
    BookingServiceInterface bookingService;
    public BookingController(BookingServiceInterface bookingService){
        this.bookingService=bookingService;
    }
    //initiate booking
    public void doBooking(User user, UUID VehicleID){
        bookingService.createBooking(user,VehicleID);
    }
    public void cancelBooking(UUID userid,UUID bookingid){
        bookingService.cancelBooking(userid,bookingid);
    }


}
