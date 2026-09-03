package PaymentGateway.Instrument;

import PaymentGateway.Instrument.entity.Instrument;
import PaymentGateway.Instrument.entity.InstrumentDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class IntrumentService {
   Map<Integer, List<Instrument>> userInstrumentMap;
   public IntrumentService(){
       this.userInstrumentMap=new HashMap<>();
   }

   public Instrument getInstrument(int userId,int instrumentId){
       List<Instrument> instruments = userInstrumentMap.get(userId);
       if (instruments == null) {
           return null;
       }
       for(Instrument instrId:instruments){
           if(instrId.instrumentId==instrumentId){
               return instrId;
           }
       }return null;
   }
   public void removeInstrument(int userId,int instrumentId){
       userInstrumentMap.get(userId).remove(instrumentId);
   }
    public abstract boolean validateIns(InstrumentDTO instrument);
    public  abstract void addInstrument(InstrumentDTO instrument);

}
