package PaymentGateway.Transaction;

import ParkingLotDP.Payment;
import PaymentGateway.Instrument.InstrumentController;
import PaymentGateway.Instrument.IntrumentService;
import PaymentGateway.Instrument.entity.Instrument;
import PaymentGateway.Instrument.entity.InstrumentType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionService {
    Map<Integer , List<Transaction>> userTransactionMap;
    PaymentProcessor paymentProcessor;
    InstrumentController instrumentController;
    public TransactionService(){
        userTransactionMap=new HashMap<>();
        paymentProcessor=new PaymentProcessor();
    }

    public void makePayment(Transaction transaction ,Instrument senderIns,Instrument receiverIns){
        paymentProcessor.processPayment(transaction,senderIns,receiverIns);
        transaction.transactionStatus="SUCCESS";
        userTransactionMap.computeIfAbsent(transaction.senderUserId, k -> new java.util.ArrayList<>()).add(transaction);
        userTransactionMap.computeIfAbsent(transaction.receiverUserId, k -> new java.util.ArrayList<>()).add(transaction);

    }
    public List<Transaction>getTransactionsByUserId(int userId){
        return userTransactionMap.get(userId);
    }
}
