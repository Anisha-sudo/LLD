package PaymentGateway.Instrument;

import PaymentGateway.Instrument.entity.InstrumentDTO;
import PaymentGateway.Instrument.entity.NEFT;

import java.util.Arrays;

public class BankPaymentService extends IntrumentService{

    public BankPaymentService(){
        super();
    }
    public boolean validateIns( InstrumentDTO instrument){
        return true;
    }
    public  void addInstrument(InstrumentDTO instrument){
        NEFT ins=new NEFT();
        ins.instrumentId = instrument.instrumentId;
        ins.instrumentType = instrument.instrumentType;
        ins.accountId = instrument.accountNumber;
        userInstrumentMap.put(instrument.userId, Arrays.asList(ins));
    }
}
