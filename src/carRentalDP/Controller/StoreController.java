package carRentalDP.Controller;

import carRentalDP.Location;
import carRentalDP.Vehicle;
import carRentalDP.service.StoreService;
import java.util.List;

public class StoreController {
    static volatile StoreController storeController;
    StoreService storeService;
    private StoreController(StoreService storeService){
        this.storeService=storeService;
    }
    public static StoreController getStoreController(){
        if(storeController!=null){
            return storeController;
        }
        return storeController=new StoreController(new StoreService());
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
