package carRentalDP.Controller;

import carRentalDP.Location;
import carRentalDP.Vehicle;
import carRentalDP.service.StoreService;
import java.util.List;

public class StoreController {
    StoreController storeController;
    StoreService storeService;

    public  StoreController(StoreService storeService){
        this.storeService=storeService;
    }
    
    public void addVehicle(Location location,List<Vehicle>vehicleList) {
    vehicleList.forEach(vehicle->{
            storeService.addVehicle(location,vehicle);
    });
    }
    public void removeVehicle(Location location,List<Vehicle>vehicleList){
        vehicleList.forEach(vehicle->{
            storeService.removeVehicle(location,vehicle);
        });
    }
    public List<Vehicle> getAvailableVehicle(Location location){
        return  storeService.getAvailableVehicle(location);
    }

}
