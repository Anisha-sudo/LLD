package atmDP.atmState;

import atmDP.Atm;
import atmDP.Card;
import atmDP.State;

public class AuthenticationState extends State {
    public boolean authenticateCard(Atm atm, Card card, int pin){
        System.out.println("AUTHENTICATE STATE");
        System.out.println("CARD IS AUTHENTICATING.........");
        if(!card.authenticateCard(pin)){
            atm.setState(new IdleState());
            return  false;
        }else{
            atm.setState(new ServicesState());
            return true;
        }
    }
}
