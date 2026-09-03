package PaymentGateway;


import PaymentGateway.Instrument.InstrumentController;
import PaymentGateway.Instrument.entity.Account;
import PaymentGateway.Instrument.entity.InstrumentDTO;
import PaymentGateway.Instrument.entity.InstrumentType;
import PaymentGateway.Transaction.Transaction;
import PaymentGateway.Transaction.TransactionController;
import PaymentGateway.user.UserDTO;

import java.util.List;

public class PaymentGateway {


    public static  void main(String args[]) {
        //add user 1 and 2
        UserDTO user1 = new UserDTO();
        user1.setUserId(1);
        user1.setName("Anisha");
        user1.setEmail("anisha@gmail.com");
        user1.setPhone("1234567890");

        System.out.println(user1.getUserId());
        System.out.println(user1.getName());
        System.out.println(user1.getEmail());
        System.out.println(user1.getPhone());

        UserDTO user2 = new UserDTO();
        user2.setUserId(2);
        user2.setName("Anisha2");
        user2.setEmail("anisha2@gmail.com");
        user2.setPhone("1234567892");

        System.out.println(user2.getUserId());
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPhone());



        Account.getInstance().addAccount(56,100);
        Account.getInstance().addAccount(78,200);
        System.out.println(Account.getInstance().getBalance(56));
        System.out.println(Account.getInstance().getBalance(78));

        //create instrument for user 1
        InstrumentDTO instrument1 = new InstrumentDTO();
        instrument1.instrumentId=1;
        instrument1.instrumentType= InstrumentType.CARD;
        instrument1.userId=1;
        instrument1.accountNumber=56;


        //create instrument for user 2
        InstrumentDTO instrument2 = new InstrumentDTO();
        instrument2.instrumentId=2;
        instrument2.instrumentType= InstrumentType.BANK;
        instrument2.userId=2;
        instrument2.accountNumber=78;

        //add instrument to controller
        InstrumentController instrumentController= new InstrumentController();
        instrumentController.addInstrument(instrument1);
        instrumentController.addInstrument(instrument2);


        //Create Transaction
         Transaction transaction=new Transaction();
         transaction.amount=100;
         transaction.senderUserId=1;
         transaction.receiverUserId=2;
         transaction.creditInstrumentId=2;
         transaction.debitInstrumentId=1;



        TransactionController transactionController=new TransactionController(instrumentController);
        transactionController.makePayment(transaction);
       List<Transaction> t= transactionController.getTransactionsByUserId(1);
       for(Transaction transaction1:t){
           System.out.println("Transaction amount: " + transaction1.amount);
           System.out.println("Sender account balance: " + Account.getInstance().getBalance(56));
           System.out.println("Receiver account balance: " + Account.getInstance().getBalance(78));
       }








    }
}
