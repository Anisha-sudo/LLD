package parkingLot;

import parkingLot.parkingSpot.ParkingSpot;
import java.time.LocalTime;

public class Ticket {
    Vehicle vehicle;
    public int ticketId;
    LocalTime EntryTime;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot){
        this.vehicle=vehicle;
        this.parkingSpot=parkingSpot;
        this.ticketId=ticketId++;
        this.EntryTime= LocalTime.now();

    }

}
