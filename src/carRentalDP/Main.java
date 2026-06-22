package carRentalDP;

import carRentalDP.Controller.BookingController;
import carRentalDP.Controller.StoreController;
import carRentalDP.service.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Add stores
        Location delhi = new Location("DELHI", 110001, "DELHI");
        Location mumbai = new Location("MUMBAI", 110002, "MUMBAI");
        StoreService delhistoreService = new StoreService();
        StoreService mumbaiStoreService = new StoreService();
        HashMap<Location, StoreServiceInterface> map = new HashMap<>();
        map.put(delhi, delhistoreService);
        map.put(mumbai, mumbaiStoreService);
        StoreController storeController = new StoreController(map);
        //Add vehicles
        List<Vehicle> vehicleList = Arrays.asList(new Vehicle(1, VehicleType.TWO_WHEELER, 100, 0), new Vehicle(2, VehicleType.FOUR_WHEELER, 100, 0));
        storeController.addVehicle(delhi, vehicleList, delhistoreService);
        storeController.addVehicle(mumbai, vehicleList, mumbaiStoreService);
        //Get available vehicles
        System.out.println("Location selected by user::"+delhi.name);
        List<Vehicle> availableVehicles = storeController.getAvailableVehicle(delhi);
        for(Vehicle v:availableVehicles){
            System.out.println("Vehicles available at requested location are::"+v.vehicleId);
        }
        UUID vehicleId = availableVehicles.get(0).vehicleId;
        System.out.println("Booking Request received for vehicle id:"+vehicleId);
        //User
        User user = new User( "Anisha", "anisha@gmail.com", "1234567890");
        //book vehicle
        PaymentService paymentService = new PaymentService();
        BookingServiceInterface bookingService = new BookingService(delhistoreService,paymentService);
        BookingController bookingController = new BookingController(bookingService);
        Booking  booking=bookingController.doBooking(user, vehicleId);
        System.out.println(booking.bookingId.toString());
        System.out.println(booking.vehicle.vehicleId.toString());
        System.out.println(booking.user.userId.toString());
        System.out.println(booking.bookingStatus);
        System.out.println(booking.payment.paymentStatus);



    }
}
