package atmDP;

public class Card {

    Account bankAccount;
    int pin=0000;

    public Card(Account account){
        this.bankAccount=account;
    }
    public int getBalance(){
        return bankAccount.getBalance();
    }
    public boolean authenticateCard(int pin){
        if(this.pin==pin){
            return true;
        }return  false;

    }
    public void setPin(int pin){
        this.pin=pin;
    }

    public void updatePostWithdrawalBalance(int withdrawnAmt){
        bankAccount.setBalance(bankAccount.getBalance()+withdrawnAmt);
    }
    public void updatePreWithdrawalBalance(int withdrawnAmt){
        bankAccount.setBalance(bankAccount.getBalance()-withdrawnAmt);
    }


}
