package carRentalDP;

import java.util.UUID;

public class Payment {
    UUID PaymentID;
    int amount;
    public PaymentStatus paymentStatus;
    public Payment(){
        this.PaymentID= UUID.randomUUID();
        this.amount=0;
        this.paymentStatus=PaymentStatus.INITIATED;
    }

}
