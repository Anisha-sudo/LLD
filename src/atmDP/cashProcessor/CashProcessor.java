package atmDP.cashProcessor;

import atmDP.Atm;


public abstract class CashProcessor {
    CashProcessor nextCashProcessor;

    public CashProcessor(CashProcessor nextCashProcessor) {
        this.nextCashProcessor = nextCashProcessor;
    }


    public  boolean withdraw(int  withDrawAmt,Atm atm){
        return nextCashProcessor.withdraw(withDrawAmt,atm);
    }


}
