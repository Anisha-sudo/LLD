package carRentalDP;

import java.util.UUID;

public class Vehicle {
    public UUID vehicleId;
    int vehicleNumber;
    VehicleType vehicleType;
    int milege;
    int kmRun;
    public VehicleStatus status;
    public Vehicle(int vehicleNumber,VehicleType vehicleType,int milege,int kmRun){
         this.vehicleNumber=vehicleNumber;
         this.vehicleType=vehicleType;
         this.milege=milege;
         this.kmRun=kmRun;
         this.status=VehicleStatus.AVAILABLE;
         this.vehicleId=UUID.randomUUID();

    }

}
