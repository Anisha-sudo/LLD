package commandDP.solution;

public class Client {
    public static void main(String[] args) {
        Command onCommand=new AcOnCommand(new Ac());
        Command offCommand=new AcOffCommand(new Ac());
        RemoteControl remoteControl=new RemoteControl();
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
        remoteControl.undo();

    }
}
