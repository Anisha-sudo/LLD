package parkingLot.parkingSpot;

import java.util.List;

public class ParkingSpotManagerTwoWheeler extends ParkingSpotManager {
    static ParkingSpotManager parkingSpotManager;
    ParkingSpotManagerTwoWheeler(List<ParkingSpot>parkingSpotList) {
        super(parkingSpotList);
    }
    public static ParkingSpotManager getParkingSpotManagerTwoWheeler(List<ParkingSpot>parkingSpotList) {
       if (parkingSpotManager!=null){
           return parkingSpotManager;
       }
       return new ParkingSpotManagerTwoWheeler(parkingSpotList);
    }

}
