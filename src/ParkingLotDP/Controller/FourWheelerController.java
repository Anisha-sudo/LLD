package ParkingLotDP.Controller;

import ParkingLotDP.ParkingSpot;
import ParkingLotDP.SlotStrategy;
import ParkingLotDP.Ticket;
import ParkingLotDP.Vehicle;

import java.util.List;

public class FourWheelerController extends ParkingSlotController {
    List<ParkingSpot> parkingSpotList;
    SlotStrategy slotStrategy;
    FourWheelerController(SlotStrategy slotStrategy,List<ParkingSpot>parkingSpotList){
        super(parkingSpotList);
        this.slotStrategy=slotStrategy;

    }

    public ParkingSpot findSpot(int gateNo){
        return slotStrategy.findSpot(parkingSpotList,gateNo);

    }
    public void addParkingSpace(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }
    public  void removeParkingSpace(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }
    public void park(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.vehicle=vehicle;
        parkingSpot.isEmpty=false;
        parkingSpotList.set(parkingSpot.id,parkingSpot);
    }
    public void unParkVehicle(Ticket ticket){
       parkingSpotList.get(ticket.parkingSpot.id).isEmpty=true;
       parkingSpotList.get(ticket.parkingSpot.id).vehicle=null;
      }
}
