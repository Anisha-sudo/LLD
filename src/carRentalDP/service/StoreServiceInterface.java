package carRentalDP.service;

import carRentalDP.Booking;
import carRentalDP.Location;
import carRentalDP.User;
import carRentalDP.Vehicle;

import java.util.List;
import java.util.UUID;

public interface StoreServiceInterface {
    public void addVehicle( Vehicle vehicle);
    public void removeVehicle( Vehicle vehicle);
    public List<Vehicle> getAvailableVehicle();
    Vehicle  bookVehicle(UUID vehicleID, User user);
    public void returnVehicle(Vehicle vehicle);
}
