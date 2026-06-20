package carRentalDP.service;

import carRentalDP.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public class StoreService {

    Map<Location, List<Vehicle>> locationStoreList;
    Map<UUID, VehicleStatus> vehicleStatusMap;
    Map<UUID, ReentrantLock> vehicleLockMap;

    public void addVehicle(Location location, Vehicle vehicle) {
        locationStoreList.computeIfAbsent(location, c -> new ArrayList<>()).add(vehicle);
    }

    public void removeVehicle(Location location, Vehicle vehicle) {
        locationStoreList.computeIfAbsent(location, c -> new ArrayList<>()).remove(vehicle);
    }

    public List<Vehicle> getAvailableVehicle(Location location) {
        List<Vehicle> vehicleList = locationStoreList.get(location);
        for (Vehicle vl : vehicleList) {
            if (vl.status.equals(VehicleStatus.AVAILABLE)) {
                vehicleList.add(vl);
            }
        }
        return vehicleList;
    }

    public Booking book(UUID vehicleID, User user) {
        ReentrantLock lock = vehicleLockMap.get(vehicleID);
        try {
            if (lock.tryLock()) {
                if (vehicleStatusMap.get(vehicleID).equals(VehicleStatus.AVAILABLE)) {
                    vehicleStatusMap.put(vehicleID, VehicleStatus.UNAVAILABLE);

                    for(Map.Entry<Location, List<Vehicle>> entry : locationStoreList.entrySet()){
                        for(Vehicle vehicle : entry.getValue()){
                            if(vehicle.vehicleId.equals(vehicleID)){
                                vehicle.status=VehicleStatus.UNAVAILABLE;
                                return new Booking(user,vehicle);
                            }
                        }
                    }

                    throw new RuntimeException("Vehicle is not available");
                } else {
                    throw new RuntimeException("Vehicle is not available");
                }

            } else {
                throw new RuntimeException("Vehicle is not available");
            }
        } finally {
            lock.unlock();
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        ReentrantLock lock = vehicleLockMap.get(vehicle.vehicleId);
        try {
            if (lock.tryLock()) {
                if (vehicleStatusMap.get(vehicle.vehicleId).equals(VehicleStatus.UNAVAILABLE)) {
                    vehicleStatusMap.put(vehicle.vehicleId, VehicleStatus.AVAILABLE);
                    for(Map.Entry<Location, List<Vehicle>> entry : locationStoreList.entrySet()){
                        for(Vehicle v : entry.getValue()){
                            if(v.vehicleId.equals(vehicle.vehicleId)){
                                vehicle.status=VehicleStatus.AVAILABLE;
                            }
                        }
                    }
                } else {
                    throw new RuntimeException("booking can't be cancelled.");
                }
            } else {
                throw new RuntimeException("Vehicle can't be returned now, booking can't be cancelled.");
            }

        } finally {
            lock.unlock();
        }
    }
}



