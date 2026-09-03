package PaymentGateway.Transaction;

import PaymentGateway.Instrument.InstrumentController;
import PaymentGateway.Instrument.entity.Instrument;
import PaymentGateway.Instrument.entity.InstrumentType;

import java.util.List;
import java.util.Map;

public class TransactionController {
    TransactionService transactionService;
    InstrumentController instrumentController;
    public TransactionController(InstrumentController instrumentController){
        this.transactionService=new TransactionService();
        this.instrumentController=instrumentController;
    }
    public void makePayment(Transaction transaction){
        Instrument senderInstrument=instrumentController.getInstrumentService(InstrumentType.CARD).getInstrument(transaction.senderUserId, transaction.debitInstrumentId);
        Instrument receiverInstrument=instrumentController.getInstrumentService(InstrumentType.BANK).getInstrument(transaction.receiverUserId, transaction.creditInstrumentId);
        if(senderInstrument==null || receiverInstrument==null){
            throw new RuntimeException("Invalid instrument");
        }

        transactionService.makePayment(transaction,senderInstrument,receiverInstrument);
    }

    public List<Transaction>getTransactionsByUserId(int userId){
        return transactionService.getTransactionsByUserId(userId);
    }

}
