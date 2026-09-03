package atmDP.atmState;

import atmDP.Atm;
import atmDP.Card;
import atmDP.State;

import java.util.Scanner;

public class ServicesState extends State {

    public  void selectOperation(Card card,int op,Atm atm){
        System.out.println("SERVICES STATE");
        switch(op) {
            case 1 :
                checkBalance(card);
                break;
            case 2:
                withdrawCash(card, atm);
                break;
            case 3:
                returnCard(atm);
                break;
            default:
            System.out.println("operation performed successfully");
        }
    }
    public void checkBalance(Card card){
        int balance =card.getBalance();
        System.out.println("SERVICES State OP:1");
       System.out.println("Balance is:"+balance);
    }

    public void withdrawCash(Card card, Atm atm){
        System.out.println("SERVICES state OP 2");
        System.out.println("Enter amount to withdraw");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        System.out.println("Initiating Cash withdrawal");
        atm.setState(new WithdrawMoneyState());
        State state= atm.getState();
        boolean success=state.withdrawCash(atm,amount,card);
        if(success)
        {  System.out.println("Cash withdrawn successfully");}
        else{
            throw new RuntimeException("Failed to withdraw amount");
        }
        atm.setState(new ServicesState());
    }
    public  void returnCard(Atm atm){
        System.out.println("SERVICES state OP 3");
        atm.setState(new IdleState());
    }
}
