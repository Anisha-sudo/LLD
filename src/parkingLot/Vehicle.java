package parkingLot;

import parkingLot.parkingSpot.ParkingSpot;

public class Vehicle {
    int vehicleNum;
    String vehicleType;
    ParkingSpot parkingSpot;


    Vehicle(ParkingSpot parkingSpot){
        this.parkingSpot=parkingSpot;
    }
    public int getVehicleNum(){
        return vehicleNum;
    }
    public String getVehicleType(){
        return vehicleType;
    }

}
