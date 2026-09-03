package ParkingLotDP;

import ParkingLotDP.Controller.ParkingManagerFactory;

import java.time.LocalTime;

public class ExitGate {
    Payment payment;
    ParkingManagerFactory parkingManagerFactory;

    ExitGate(Payment payment,ParkingManagerFactory parkingManagerFactory){
        this.payment=payment;
    }
    public void unParkVehicle(Ticket ticket){
        //payment can be done using strategy pattern for pricing (hourly/min)/(cash/upi) as of now kept it simple.
        if(!payment.calculatePayment(ticket)){
            throw new RuntimeException("Payment not done!!!Please Retry Payment");
        };
        parkingManagerFactory.getparkingSpotController(ticket.vehicle.vehicleType).unParkVehicle(ticket);
        ticket.exitTime= LocalTime.now();

    }
}
