package PaymentGateway.Instrument;

import PaymentGateway.Instrument.entity.InstrumentType;
import java.util.HashMap;
import java.util.Map;

public class InstrumentServiceFactory {
    private Map<InstrumentType, IntrumentService> serviceCache = new HashMap<>();

    public IntrumentService getInstrument(InstrumentType instrumentType)
    {
        if (serviceCache.containsKey(instrumentType)) {
            return serviceCache.get(instrumentType);
        }

        IntrumentService service;
        switch(instrumentType){
            case CARD :
                service = new CardPaymentService();
                break;
            case BANK:
                service = new BankPaymentService();
                break;
            default:
                return null;
        }
        serviceCache.put(instrumentType, service);
        return service;
    }
}
