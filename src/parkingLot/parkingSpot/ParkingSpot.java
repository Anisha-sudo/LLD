package parkingLot.parkingSpot;

public class ParkingSpot {
    int parkingSpotId=0;
    boolean isEmpty;

  boolean isEmpty(){
      return isEmpty;
  }

  public void parkVehicle(){
      isEmpty=false;
      parkingSpotId++;
  }

  public void removeVehicle(){
      parkingSpotId--;
      isEmpty=true;
  }
}
