package carRentalDP.Controller;

import carRentalDP.Booking;
import carRentalDP.service.BookingService;

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


}
