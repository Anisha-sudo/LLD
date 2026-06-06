package bookMyShowDp;

import java.util.List;

public class BookingController {
    BookingService bookingService;
    public BookingController(){
        bookingService=new BookingService();
    }

    public Booking bookSeats(User user,Show show,List<Integer> seatList){
        return bookingService.bookSeats(user,show,seatList);

    }
}
