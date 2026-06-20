package carRentalDP.service;

import carRentalDP.*;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class StoreService implements StoreServiceInterface{

    Map<Location, List<Vehicle>> locationStoreList;
    Map<UUID, VehicleStatus> vehicleStatusMap;
    Map<UUID, ReentrantLock> vehicleLockMap;

    public StoreService(){
        locationStoreList=new HashMap<>();
        vehicleStatusMap=new HashMap<>();
        vehicleLockMap=new HashMap<>();
    }
    public void addVehicle(Location location, Vehicle vehicle) {
        locationStoreList.computeIfAbsent(location, c -> new ArrayList<>()).add(vehicle);
        vehicleStatusMap.put(vehicle.vehicleId, VehicleStatus.AVAILABLE);
        vehicleLockMap.put(vehicle.vehicleId, new ReentrantLock());
    }

    public void removeVehicle(Location location, Vehicle vehicle) {
        locationStoreList.get(location).remove(vehicle);
        vehicleStatusMap.remove(vehicle.vehicleId);
        vehicleLockMap.remove(vehicle.vehicleId);
    }

    public List<Vehicle> getAvailableVehicle(Location location) {
        List<Vehicle> vehicleListAns=new ArrayList<>();
        List<Vehicle> vehicleList = locationStoreList.get(location);
        for (Vehicle vl : vehicleList) {
            if (vl.status.equals(VehicleStatus.AVAILABLE)) {
                vehicleListAns.add(vl);
            }
        }
        return vehicleListAns;
    }

    public Booking bookVehicle(UUID vehicleID, User user) {
        ReentrantLock lock = vehicleLockMap.get(vehicleID);
        List<ReentrantLock>acquiredLocks=new ArrayList<>();
        try {
            if(lock.tryLock()) {
                acquiredLocks.add(lock);
                if (vehicleStatusMap.get(vehicleID).equals(VehicleStatus.AVAILABLE)) {
                    vehicleStatusMap.put(vehicleID, VehicleStatus.UNAVAILABLE);

                    for (Map.Entry<Location, List<Vehicle>> entry : locationStoreList.entrySet()) {
                        for (Vehicle vehicle : entry.getValue()) {
                            if (vehicle.vehicleId.equals(vehicleID)) {
                                vehicle.status = VehicleStatus.UNAVAILABLE;
                                return new Booking(user, vehicle);
                            }
                        }
                    }

                    throw new RuntimeException("Vehicle is not available");
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

                    if (vehicleStatusMap.get(vehicle.vehicleId).equals(VehicleStatus.UNAVAILABLE)) {
                        vehicleStatusMap.put(vehicle.vehicleId, VehicleStatus.AVAILABLE);
                        for (Map.Entry<Location, List<Vehicle>> entry : locationStoreList.entrySet()) {
                            for (Vehicle v : entry.getValue()) {
                                if (v.vehicleId.equals(vehicle.vehicleId)) {
                                    v.status = VehicleStatus.AVAILABLE;
                                }
                            }
                        }
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



