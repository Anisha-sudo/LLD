package atmDP;

public class User {
    Card card;

    public void issueCard(Card card){
        this.card=card;

    }
    public void depositMoney(int amount){
        card.bankAccount.setBalance(amount);
    }
    public void setPin(int pin){
        card.setPin(pin);
    }

}
