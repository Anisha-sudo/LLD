package carRentalDP.service;

import carRentalDP.Location;
import carRentalDP.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StoreService {

    Map<Location, List<Vehicle>> locationStoreList;

    public void addVehicle(Location location,Vehicle vehicle){
        locationStoreList.computeIfAbsent(location,c->new ArrayList<>()).add(vehicle);
    }
    public void removeVehicle(Location location,Vehicle vehicle){
        locationStoreList.computeIfAbsent(location,c->new ArrayList<>()).remove(vehicle);
    }

    public List<Vehicle> getAvailableVehicle(Location location){
       for(Map.Entry<Location,List<Vehicle>> mp: locationStoreList.entrySet()){
           if(mp.getKey().equals(location))
           {return mp.getValue();}
       }
       return  null;
    }


}
