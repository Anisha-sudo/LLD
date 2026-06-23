package snake$ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    Dice(int diceCount){
        this.diceCount=diceCount;
    }
    public int rollDice(){
        int res=0;
        int count = diceCount;
        while(count>0){
            res=res+ThreadLocalRandom.current().nextInt(1, 6);
            System.out.println("Rolling dice......"+res);
            count--;
        }
        return res;
    }
}
