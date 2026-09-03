package atmDP;

public class Atm {
    State state;
    int amount;
    public int twoKnotes;
    public int fiveHundrednotes;
    public int hundredNotes;
    public Atm(State state){
        this.state=state;
        twoKnotes=1;
        fiveHundrednotes=1;
        hundredNotes=5;
        this.amount=twoKnotes*2000+fiveHundrednotes*500+hundredNotes*100;
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return state;
    }
    public int getBalance(){
        return amount;
    }
}
