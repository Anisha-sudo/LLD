package carRentalDP.service;



import carRentalDP.*;
import carRentalDP.Payment;

import java.util.*;

import static carRentalDP.PaymentStatus.COMPLETED;
import static carRentalDP.PaymentStatus.FAILED;
import static java.lang.Thread.sleep;

public class BookingService  implements BookingServiceInterface{
     Map<UUID,List<Booking>> userBookingMap;
     StoreServiceInterface storeService;
     PaymentServiceInterface paymentService;
     public BookingService(StoreServiceInterface storeService,PaymentServiceInterface paymentService){
         userBookingMap=new HashMap<>();
         this.storeService=storeService;
         this.paymentService=paymentService;
     }

     public Booking createBooking(User user, UUID vehicleId) {
         Vehicle vehicle = storeService.bookVehicle(vehicleId, user);
         Booking booking = new Booking(user, vehicle);
         userBookingMap.computeIfAbsent(user.userId, c -> new ArrayList<>()).add(booking);
         paymentService.chargeUser(user,booking,(Payment payment)->{
             if (payment.paymentStatus == COMPLETED) {
                 booking.bookingStatus = BookingStatus.COMPLETED;
                 booking.payment=payment;
             }else if(payment.paymentStatus == FAILED){
                 cancelBooking(user.userId, booking.bookingId);
                 booking.payment=payment;
             }
         });



 //        Payment payment = paymentService.chargeUser(user, booking);
//   if (payment.paymentStatus.equals(PaymentStatus.FAILED)) {
//             cancelBooking(user.userId, booking.bookingId);
//         } else {
//             try {
//                 while (payment.paymentStatus.equals(PaymentStatus.IN_PROGRESS) || payment.paymentStatus.equals(PaymentStatus.PENDING)) {
//                     Thread.sleep(1000);
//                 }
//             } catch (Exception e) {
//                 throw new RuntimeException("Payment failed");
//             }
//             booking.bookingStatus = BookingStatus.COMPLETED;
//         }
         return booking;
     }


     public void cancelBooking(UUID userID,UUID bookingId){
         List<Booking> bookingList=userBookingMap.getOrDefault(userID,new ArrayList<>());
         for(Booking booking :bookingList){
             if(booking.bookingId.equals(bookingId)){
                 storeService.returnVehicle(booking.vehicle);
                 booking.bookingStatus=BookingStatus.CANCELLED;
                 break;
             }
         }

     }
}
