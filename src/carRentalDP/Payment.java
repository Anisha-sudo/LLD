package carRentalDP;

import java.util.UUID;

public class Payment {
    UUID PaymentID;
    int amount;
    public PaymentStatus paymentStatus;
    public Payment(int amount){
        this.PaymentID= UUID.randomUUID();
        this.paymentStatus=PaymentStatus.INITIATED;
        this.amount=amount;
    }

}
