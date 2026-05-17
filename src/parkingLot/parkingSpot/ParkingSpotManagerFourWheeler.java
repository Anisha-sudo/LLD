package parkingLot.parkingSpot;

import java.util.List;

public class ParkingSpotManagerFourWheeler extends ParkingSpotManager{
    static ParkingSpotManager parkingSpotManager;
    ParkingSpotManagerFourWheeler(List<ParkingSpot>parkingSpotList) {
        super(parkingSpotList);
    }
    public static ParkingSpotManager getParkingSpotManagerFourWheeler(List<ParkingSpot>parkingSpotList) {
        if (parkingSpotManager!=null){
            return parkingSpotManager;
        }
        return new ParkingSpotManagerFourWheeler(parkingSpotList);
    }

}
