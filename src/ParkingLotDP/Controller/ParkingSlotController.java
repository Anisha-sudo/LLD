package ParkingLotDP.Controller;

import ParkingLotDP.ParkingSpot;
import ParkingLotDP.Ticket;
import ParkingLotDP.Vehicle;

import java.util.List;

public abstract class ParkingSlotController {
    List<ParkingSpot> parkingSpotList;

    public ParkingSlotController(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList=parkingSpotList;
    }
    public abstract ParkingSpot findSpot(int gateNo);
    public abstract void addParkingSpace(ParkingSpot parkingSpot);
    public abstract void removeParkingSpace(ParkingSpot parkingSpot);
    public abstract void park(Vehicle vehicle, ParkingSpot parkingSpot);
    public abstract void unParkVehicle(Ticket ticket);


}
