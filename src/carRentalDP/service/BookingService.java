package carRentalDP.service;



import carRentalDP.Booking;
import carRentalDP.BookingStatus;
import carRentalDP.User;
import carRentalDP.Vehicle;

import java.util.*;

public class BookingService {
     Map<UUID,List<Booking>> userBookingMap;
     StoreService storeService;
     public BookingService(){
         userBookingMap=new HashMap<>();
     }

     public User createUser(){
         return new User();
     }
     public void createBooking(User user, UUID vehicleId){
         Booking booking=storeService.book(vehicleId,user);
         PaymentService paymentService=new PaymentService();
         Boolean isSuccess=paymentService.chargeUser(user,booking);
         if(!isSuccess){
             cancelBooking(user.userId,booking.bookingId);
             booking.bookingStatus= BookingStatus.CANCELLED;
         }else{
         booking.bookingStatus= BookingStatus.COMPLETED;}
         userBookingMap.computeIfAbsent(user.userId,c->new ArrayList<>()).add(booking);

     }
     public void cancelBooking(UUID userID,UUID bookingId){
         List<Booking> bookingList=userBookingMap.get(userID);
         for(Booking booking :bookingList){
             if(booking.bookingId.equals(bookingId)){
                 storeService.returnVehicle(booking.vehicle);
                 booking.bookingStatus=BookingStatus.CANCELLED;
                 break;
             }
         }

     }
}
