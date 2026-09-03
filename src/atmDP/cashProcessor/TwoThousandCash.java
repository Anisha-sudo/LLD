package atmDP.cashProcessor;

import atmDP.Atm;

public class TwoThousandCash extends CashProcessor {

    public TwoThousandCash(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }
    public boolean withdraw(int withDrawnAmt, Atm atm){
        int notesAvailable=atm.twoKnotes;
        int notesConsumble=withDrawnAmt/2000;
        if (notesConsumble>notesAvailable){
            if(!nextCashProcessor.withdraw(withDrawnAmt-(2000*notesAvailable),atm))return false;
            atm.twoKnotes=0;
            return true;
        }else{
            if(! nextCashProcessor.withdraw(withDrawnAmt-(2000*notesConsumble),atm))return false;
            atm.twoKnotes=atm.twoKnotes-notesConsumble;
            return true;
        }
    }
}
