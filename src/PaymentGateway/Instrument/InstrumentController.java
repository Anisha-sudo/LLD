package PaymentGateway.Instrument;

import PaymentGateway.Instrument.entity.Instrument;
import PaymentGateway.Instrument.entity.InstrumentDTO;
import PaymentGateway.Instrument.entity.InstrumentType;

public class InstrumentController {
    InstrumentServiceFactory instrumentServiceFactory;
    public InstrumentController(){

       instrumentServiceFactory=new InstrumentServiceFactory();

    }
    public IntrumentService getInstrumentService(InstrumentType instrumentType){
        return instrumentServiceFactory.getInstrument(instrumentType);
    }

    public void removeInstrument(int userId, int instrumentId, InstrumentType instrumentType){
        instrumentServiceFactory.getInstrument(instrumentType).removeInstrument(userId,instrumentId);
    }
    public void addInstrument( InstrumentDTO instrument){
        if(instrumentServiceFactory.getInstrument(instrument.instrumentType).validateIns(instrument)){
            instrumentServiceFactory.getInstrument(instrument.instrumentType).addInstrument(instrument);
        }else {
            System.out.print("validation failed");
            return;
        }
    }
    public Instrument getInstrument(int userID,InstrumentDTO instrument){
       return instrumentServiceFactory.getInstrument(instrument.instrumentType).getInstrument(userID,instrument.instrumentId);
    }

}
