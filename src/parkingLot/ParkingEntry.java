package parkingLot;

import parkingLot.parkingSpot.*;

import java.util.List;

public class ParkingEntry {
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    List<ParkingSpot>parkingSpotList;

    public ParkingEntry(ParkingSpotManagerFactory parkingSpotManagerFactory, List<ParkingSpot>parkingSpotList){
         this.parkingSpotManagerFactory=parkingSpotManagerFactory;
         this.parkingSpotList=parkingSpotList;

    }
    public boolean isParkingAvailable(Vehicle vehicle){
        if (parkingSpotManagerFactory.getParkingSpotManager(vehicle,parkingSpotList).parkVehicle(vehicle)!=null)
            return true;
        return false;
    }
    public Ticket getTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot=parkingSpotManagerFactory.getParkingSpotManager(vehicle,parkingSpotList).parkVehicle(vehicle);
         Ticket ticket=  new Ticket(vehicle,parkingSpot);
         System.out.println(ticket.ticketId);
         return ticket;
    }

}
