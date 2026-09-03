package atmDP;

import atmDP.atmState.IdleState;

public class ATMrooom {
 ;
 public static void main(String args[]){
        State initialState=new IdleState();
        Atm atm= new Atm(initialState);

        User user=new User();

        Account bankAcc=new Account();
        Card card=new Card(bankAcc);
        user.issueCard(card);
        user.setPin(1234);
        user.depositMoney(10000);

        initialState.insertCard(atm);
        atm.getState().authenticateCard(atm,card,1234);
        atm.getState().selectOperation(card,1,atm);
        atm.getState().selectOperation(card,2,atm);
        atm.getState().selectOperation(card,1,atm);
        atm.getState().selectOperation(card,3,atm);


        initialState.insertCard(atm);
        atm.getState().authenticateCard(atm,card,1234);
        atm.getState().selectOperation(card,1,atm);
        atm.getState().selectOperation(card,2,atm);
        atm.getState().selectOperation(card,1,atm);
        atm.getState().selectOperation(card,3,atm);

        System.out.println("User exited atm!");
 }
}
