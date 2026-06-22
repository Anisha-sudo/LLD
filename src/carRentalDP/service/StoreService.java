package carRentalDP.service;

import carRentalDP.*;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class StoreService implements StoreServiceInterface{


    Map<UUID, Vehicle> vehicleMap;
    Map<UUID, ReentrantLock> vehicleLockMap;

    public StoreService(){
        vehicleMap=new HashMap<>();
        vehicleLockMap=new HashMap<>();
    }
    public void addVehicle( Vehicle vehicle) {
        vehicleMap.put(vehicle.vehicleId, vehicle);
        vehicleLockMap.put(vehicle.vehicleId, new ReentrantLock());
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicleMap.remove(vehicle.vehicleId);
        vehicleLockMap.remove(vehicle.vehicleId);
    }

    public List<Vehicle> getAvailableVehicle() {
        List<Vehicle> vehicleListAns=new ArrayList<>();
       for(Map.Entry<UUID, Vehicle> mp :vehicleMap.entrySet()){
           if(mp.getValue().status == VehicleStatus.AVAILABLE){
               vehicleListAns.add(mp.getValue());
           }
       }
        return vehicleListAns;
    }

    public Vehicle bookVehicle(UUID vehicleID, User user) {
        ReentrantLock lock = vehicleLockMap.get(vehicleID);
        List<ReentrantLock>acquiredLocks=new ArrayList<>();
        try {
            if(lock.tryLock()) {
                acquiredLocks.add(lock);
                if (vehicleMap.get(vehicleID).status.equals(VehicleStatus.AVAILABLE)) {
                     vehicleMap.get(vehicleID).status=VehicleStatus.UNAVAILABLE;
                     return vehicleMap.get(vehicleID);
                } else {
                    throw new RuntimeException("Vehicle is not available");
                }
            }else {
                throw new RuntimeException("Vehicle is not available");
            }
        } finally {
            for(ReentrantLock locks:acquiredLocks)
            {
                locks.unlock();
            }
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        ReentrantLock lock = vehicleLockMap.get(vehicle.vehicleId);
        List<ReentrantLock>acquiredLocks=new ArrayList<>();
        try {
            if(lock.tryLock()) {
                    acquiredLocks.add(lock);

                    if (vehicleMap.get(vehicle.vehicleId).status.equals(VehicleStatus.UNAVAILABLE)) {
                        vehicleMap.get(vehicle.vehicleId).status=VehicleStatus.AVAILABLE;

                    } else {
                        throw new RuntimeException("booking can't be cancelled.");
                    }
                }else {
                    throw  new RuntimeException("Vehicle is not available");
                }
        } finally {
            for(ReentrantLock locks:acquiredLocks)
            {
                locks.unlock();
            }

        }
    }
}



