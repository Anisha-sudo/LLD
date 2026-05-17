package parkingLot.parkingSpot;

import parkingLot.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    int size=100;
    Vehicle vehicle;
  List<ParkingSpot>parkingSpotList;

  ParkingSpotManager(List<ParkingSpot> parkingSpotList){
      this.parkingSpotList=parkingSpotList;
  }

    public void addParkingSpot(ParkingSpot parkingSpot){
      parkingSpotList.add(parkingSpot);
        size++;
    }
    public void removeParkingSpot(ParkingSpot parkingSpot){
      parkingSpotList.remove(parkingSpot);
        size--;
    }


    public ParkingSpot parkVehicle(Vehicle vehicle){

        for(ParkingSpot p :parkingSpotList ){
            if(p.isEmpty()){
                p.parkVehicle();
                return  p;
            }
        }
        return null;

    }
    public void removeVehicle(ParkingSpot parkingSpot){
      parkingSpot.removeVehicle();
    }
}
