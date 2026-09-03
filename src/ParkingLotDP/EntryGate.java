package ParkingLotDP;

import ParkingLotDP.Controller.ParkingManagerFactory;

import java.time.LocalTime;

public class EntryGate {

    ParkingManagerFactory parkingManagerFactory;


    public EntryGate(ParkingManagerFactory parkingManagerFactory){
        this.parkingManagerFactory=parkingManagerFactory;

    }
    public void addSpot(ParkingSpot parkingSpot){
        parkingManagerFactory.getparkingSpotController(parkingSpot.vehicle.vehicleType).addParkingSpace(parkingSpot);
    }
    public void removeSpot(ParkingSpot parkingSpot){
        parkingManagerFactory.getparkingSpotController(parkingSpot.vehicle.vehicleType).removeParkingSpace(parkingSpot);
    }
    public void findParkingSpot(Vehicle vehicle,int gateNo){
        ParkingSpot parkingSpot= parkingManagerFactory.getparkingSpotController(vehicle.vehicleType).findSpot(gateNo);
        if(parkingSpot==null){
            throw new RuntimeException("No parking spot available");
        }
        parkVehicle(vehicle,parkingSpot);
    }

    public void parkVehicle(Vehicle vehicle,ParkingSpot parkingSpot){
       parkingManagerFactory.getparkingSpotController(vehicle.vehicleType).park(vehicle,parkingSpot);
       generateTicket(vehicle,parkingSpot);
    }
    public Ticket generateTicket(Vehicle vehicle,ParkingSpot parkingSpot){
      Ticket ticket=new Ticket();
      ticket.vehicle=vehicle;
      ticket.parkingSpot=parkingSpot;
      ticket.entryTime= LocalTime.now();
     return ticket;
    }

}
