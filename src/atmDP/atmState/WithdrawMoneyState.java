package atmDP.atmState;

import atmDP.Atm;
import atmDP.Card;
import atmDP.State;
import atmDP.cashProcessor.CashProcessor;
import atmDP.cashProcessor.FiveHundredCash;
import atmDP.cashProcessor.HundredCash;
import atmDP.cashProcessor.TwoThousandCash;

public class WithdrawMoneyState  extends State {

    public boolean withdrawCash(Atm atm, int withdrawnAmt, Card card){
        if(!validateAmount(atm,card,withdrawnAmt))return false;
        card.updatePreWithdrawalBalance(withdrawnAmt);
        CashProcessor cashProcessor =new TwoThousandCash(new FiveHundredCash(new HundredCash(null)));
        if(  !cashProcessor.withdraw(withdrawnAmt,atm)){
            card.updatePostWithdrawalBalance(withdrawnAmt);
            return false;
        }
        return true;
    }
    public  boolean validateAmount(Atm atm,Card card,int withdrawnAmt){
        return  (card.getBalance()>=withdrawnAmt && atm.getBalance()>=withdrawnAmt);
    }
}
