package atmDP.atmState;

import atmDP.Atm;
import atmDP.State;

public class IdleState extends State {

    public  void insertCard(Atm atm) {
        System.out.println("IDLE STATE");
        System.out.println("ATM CARD IS INSERTED");
        atm.setState(new AuthenticationState());
    }

}
