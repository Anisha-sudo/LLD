package atmDP.cashProcessor;

import atmDP.Atm;

public class FiveHundredCash extends CashProcessor {

    public  FiveHundredCash(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }
    public boolean withdraw(int withDrawnAmt, Atm atm){
        int notesAvailable=atm.fiveHundrednotes;
        int notesConsumeable=withDrawnAmt/500;
        if (notesConsumeable>notesAvailable){
            if( !nextCashProcessor.withdraw(withDrawnAmt-(500*notesAvailable),atm))return false;
            atm.fiveHundrednotes=0;
            return true;
        }else{
            if(! nextCashProcessor.withdraw(withDrawnAmt-(500*notesConsumeable),atm))return false;
            atm.twoKnotes=atm.twoKnotes-notesConsumeable;
            return true;
        }
    }
}
