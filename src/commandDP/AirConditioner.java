package commandDP;

public class AirConditioner {

    //no abstraction , if we want to change the behavior of ac we have to change the class
    //so we will use command pattern to make it abstract
    //if we want to undo or redo the action client will have to perform the action in  the class
    //client should know internally about how functionally it works which is not a good practice
    //so we will use command pattern to make it abstract
    //solution: client -->invoker-->command-->receiver

    boolean isOn;
    int temperature;

    public void turnOn(){
        isOn=true;
        System.out.println("Ac is on");
    }

    public void turnOff(){
        isOn=false;
        System.out.println("Ac is off");
    }
}
