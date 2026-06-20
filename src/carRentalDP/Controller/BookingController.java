package carRentalDP.Controller;

import carRentalDP.Booking;
import carRentalDP.User;
import carRentalDP.service.BookingService;

import java.util.UUID;

public class BookingController {
    static volatile BookingController bookingController;
    BookingService bookingService;
    private BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }
    public static BookingController getBookingController(){
        if(bookingController!=null){
            return bookingController;
        }
        return bookingController=new BookingController(new BookingService());
    }

    //initiate booking
    public void doBooking(User user, UUID VehicleID){
        bookingService.createBooking(user,VehicleID);
    }
    public void cancelBooking(UUID userid,UUID bookingid){
        bookingService.cancelBooking(userid,bookingid);
    }


}
