package ParkingLotDP;

public class Payment {
    public boolean calculatePayment(Ticket ticket) {
        int timeDiff = ticket.exitTime.getHour() - ticket.entryTime.getHour();
        int cost = ticket.vehicle.vehicleType == VehicleType.TWO_WHEELER ? timeDiff * 2 : timeDiff * 5;
        return true;
    }
}
