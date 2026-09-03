package PaymentGateway.Transaction;

public class Transaction {

    public int transactionId;
    public int senderUserId;
    public int receiverUserId;
    public int debitInstrumentId;
    public int creditInstrumentId;
    public double amount;
    public String transactionStatus;
}
