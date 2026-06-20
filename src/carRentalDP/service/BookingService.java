package carRentalDP.service;



import carRentalDP.Booking;
import carRentalDP.BookingStatus;
import carRentalDP.User;
import carRentalDP.Vehicle;

import java.util.*;

public class BookingService  implements BookingServiceInterface{
     Map<UUID,List<Booking>> userBookingMap;
     StoreServiceInterface storeService;
     public BookingService(StoreServiceInterface storeService){
         userBookingMap=new HashMap<>();
         this.storeService=storeService;
     }

     public void createBooking(User user, UUID vehicleId){
         Booking booking=storeService.bookVehicle(vehicleId,user);
         userBookingMap.computeIfAbsent(user.userId,c->new ArrayList<>()).add(booking);
         PaymentServiceInterface paymentService=new PaymentService();
         Boolean isSuccess=paymentService.chargeUser(user,booking);
         if(!isSuccess){
             cancelBooking(user.userId,booking.bookingId);

         }else{
         booking.bookingStatus= BookingStatus.COMPLETED;}

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
