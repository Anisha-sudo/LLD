package ParkingLotDP.Controller.SlotStrategy;

import ParkingLotDP.ParkingSpot;
import ParkingLotDP.SlotStrategy;

import java.util.List;

public class NearestToEntranceGateStrategy implements SlotStrategy {


    public ParkingSpot findSpot(List<ParkingSpot> parkingSpotList,int gateNo) {
      //use gateNo to find nearest spot or use heap to store parkingSlot and dist to gateNo and return nearest spot
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.isEmpty && parkingSpot.vehicle==null) {
                return parkingSpot;
            }
        }
        return null;
    }
}
