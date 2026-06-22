package carRentalDP.Controller;

import carRentalDP.Location;
import carRentalDP.Vehicle;
import carRentalDP.service.StoreService;
import carRentalDP.service.StoreServiceInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreController {

    Map<Location,StoreServiceInterface>locationStoreMap;

    public  StoreController(Map<Location,StoreServiceInterface>locationStoreMp){
        locationStoreMap=new HashMap<>();
        locationStoreMap.putAll(locationStoreMp);
    }

    public void addVehicle(Location location,List<Vehicle>vehicleList,StoreService storeService) {

      for(Vehicle v:vehicleList){
          storeService.addVehicle(v);
      }
    }
    public void removeVehicle(Location location,List<Vehicle>vehicleList,StoreService storeService){

        for(Vehicle v:vehicleList){
            storeService.removeVehicle(v);
        }
    }


    public List<Vehicle> getAvailableVehicle(Location location){
        StoreServiceInterface storeService = locationStoreMap.get(location);
        List<Vehicle> vehicleList=new ArrayList<>();
        vehicleList.addAll(storeService.getAvailableVehicle());
        return vehicleList;
    }

}
