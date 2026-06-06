package bookMyShowDp;

import java.util.List;

public class BookingService {

    public Booking bookSeats(User user,Show show, List<Integer> seatlist){
        if(!show.lockSeats(seatlist)){
            throw  new RuntimeException("seats not available");
        };



    return null;
    }
}
