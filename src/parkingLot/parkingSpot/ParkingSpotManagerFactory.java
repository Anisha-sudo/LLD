package parkingLot.parkingSpot;

import parkingLot.Vehicle;

import java.util.List;

import static parkingLot.parkingSpot.ParkingSpotManagerFourWheeler.getParkingSpotManagerFourWheeler;
import static parkingLot.parkingSpot.ParkingSpotManagerTwoWheeler.getParkingSpotManagerTwoWheeler;

public class ParkingSpotManagerFactory{

    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle, List<ParkingSpot>parkingSpotList){
        if(vehicle.getVehicleType().equals("TwoWheeler")){
            return getParkingSpotManagerTwoWheeler(parkingSpotList);
        }else {
            return getParkingSpotManagerFourWheeler(parkingSpotList);
        }

    }
}
