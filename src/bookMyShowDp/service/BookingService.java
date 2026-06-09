package bookMyShowDp.service;

import bookMyShowDp.Booking;
import bookMyShowDp.Payment;
import bookMyShowDp.Show;
import bookMyShowDp.User;

import java.util.List;

public class BookingService {

    public Booking bookSeats(User user, Show show, List<Integer> seatlist){
        Booking booking = null;
        if(!show.lockSeats(seatlist)){
            //this is updating seat stat to lcoked.
            throw  new RuntimeException("seats not available");
        }

        PaymentService paymentService= new PaymentService();
        Payment payment=paymentService.makePayment(seatlist);

        if(!payment.paymentStatus.equals("SUCCESS")){
            show.rollbackSeats(seatlist);
        }else {
            show.updateSeatStatusToBooked(seatlist);
             booking = new Booking(user,seatlist,show,payment);
        }
        return booking;
    }
}
