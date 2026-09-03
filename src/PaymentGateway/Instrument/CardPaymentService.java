package PaymentGateway.Instrument;

import PaymentGateway.Instrument.entity.Card;
import PaymentGateway.Instrument.entity.InstrumentDTO;

import java.util.Arrays;

public class CardPaymentService extends IntrumentService{

    public CardPaymentService(){
        super();
    }

public boolean validateIns(InstrumentDTO instrument){
    return true;
}
    public  void addInstrument( InstrumentDTO instrument){
        Card ins=new Card();
        //while adding card we can have user and account mapping so every instrument will have user and account mapping,
        // so we can fetch account balance while processing payment
        ins.instrumentId = instrument.instrumentId;
        ins.instrumentType = instrument.instrumentType;
        ins.accountId=instrument.accountNumber;
        userInstrumentMap.put(instrument.userId, Arrays.asList(ins));
    }

}
