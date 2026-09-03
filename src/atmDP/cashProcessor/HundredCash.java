package atmDP.cashProcessor;

import atmDP.Atm;

public class HundredCash extends CashProcessor {

    public  HundredCash(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }
    public boolean withdraw(int withDrawnAmt, Atm atm){
        int notesAvailable=atm.fiveHundrednotes;
        int notesConsumeable=withDrawnAmt/100;
        if (notesConsumeable>notesAvailable){
            return false;
        }else{
            atm.twoKnotes=atm.twoKnotes-notesConsumeable;
            return true;
        }
    }
}
