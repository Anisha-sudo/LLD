package PaymentGateway.Instrument.entity;

import java.util.HashMap;
import java.util.Map;

public class Account {
    int accountId;
    double balance;
    private static Account instance;
     Map<Integer,Double>accuntIDtoBalance;
    private Account(){
    accuntIDtoBalance = new HashMap<>();
    }
    public static Account getInstance(){
        if (instance==null){
             instance= new Account();
        }return instance;
    }
    public void addAccount(int accountId,double balance){
        accuntIDtoBalance.put(accountId,balance);
    }
    public double getBalance(int accountId){
        return accuntIDtoBalance.get(accountId);
    }
    public void updateBalance(int accountId,double balance){
        accuntIDtoBalance.put(accountId,balance);
    }
}
