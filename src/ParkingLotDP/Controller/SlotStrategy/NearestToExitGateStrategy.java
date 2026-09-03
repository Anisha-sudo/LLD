package ParkingLotDP.Controller.SlotStrategy;

import ParkingLotDP.ParkingSpot;
import ParkingLotDP.SlotStrategy;

import java.util.List;

public class NearestToExitGateStrategy implements SlotStrategy {

    public ParkingSpot findSpot(List<ParkingSpot> parkingSpotList,int gateNo){
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.isEmpty && parkingSpot.vehicle==null) {
                return parkingSpot;
            }
        }
        return null;

    }
}
