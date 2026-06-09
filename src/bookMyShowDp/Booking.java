package bookMyShowDp;

import java.awt.print.Book;
import java.util.List;
import java.util.UUID;

public class Booking {
    UUID bookingId;
    User userId;
    Show show;
    Payment payment;
    List<Integer>seats;
    public Booking(User user,List<Integer>seats,Show show,Payment payment){
        this.bookingId= UUID.randomUUID();
        this.userId=user;
        this.show=show;
        this.payment=payment;
        this.seats=seats;

    }

}
