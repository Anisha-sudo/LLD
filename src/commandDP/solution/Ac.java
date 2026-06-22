package commandDP.solution;

public class Ac {
    //this is receiver
    boolean isOn;
    int temp;

    public void turnOn(){
        isOn=true;
        System.out.println("Ac is on");
    }

    public void turnOff(){
        isOn=false;
        System.out.println("Ac is off");
    }
}
