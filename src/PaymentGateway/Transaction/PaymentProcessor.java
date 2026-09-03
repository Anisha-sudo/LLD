package PaymentGateway.Transaction;

import PaymentGateway.Instrument.entity.Account;
import PaymentGateway.Instrument.entity.Instrument;

public class PaymentProcessor {
    Account account;
    public PaymentProcessor(){
        this.account=Account.getInstance();
    }

    public void processPayment(Transaction transaction , Instrument senderIns, Instrument receiverIns){
              int senderAccountId=senderIns.accountId;
              double senderAccountBalance=account.getBalance(senderAccountId);
              int receiverAccountId=receiverIns.accountId;
              double receiverAccountBalance=account.getBalance(receiverAccountId);
             if(transaction.amount>senderAccountBalance){
                 throw new RuntimeException("Insufficient balance");
             }
             account.updateBalance(receiverIns.accountId,receiverAccountBalance+transaction.amount);
             account.updateBalance(senderIns.accountId,senderAccountBalance-transaction.amount);
    }
}
