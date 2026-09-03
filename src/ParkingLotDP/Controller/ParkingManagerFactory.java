package ParkingLotDP.Controller;

import ParkingLotDP.ParkingSpot;
import ParkingLotDP.SlotStrategy;
import ParkingLotDP.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingManagerFactory {

    private final Map<VehicleType, ParkingSlotController> controllers = new HashMap<>();

    public ParkingManagerFactory(SlotStrategy twoWheelerStrategy, SlotStrategy fourWheelerStrategy, List<ParkingSpot>twoWheelerList, List<ParkingSpot>fourWheelerList){
        controllers.put(VehicleType.TWO_WHEELER,
                new TwoWheelerController(twoWheelerStrategy, twoWheelerList));
        controllers.put(VehicleType.FOUR_WHEELER,
                new FourWheelerController(fourWheelerStrategy, fourWheelerList));
    }

    public ParkingSlotController getparkingSpotController(VehicleType vehicleType){
        return controllers.get(vehicleType);
    }
}
