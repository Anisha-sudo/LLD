package ParkingLotDP;

import java.util.List;

public interface SlotStrategy {
    public ParkingSpot findSpot( List<ParkingSpot>parkingSpotList,int gateNo);
}
