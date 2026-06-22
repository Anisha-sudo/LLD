package commandDP.solution;

public class AcOffCommand implements  Command {

    //remember we had execute method in all jobProcessor of exdid , did , ping etc
    //all command class has the receiver
    Ac ac;
    public AcOffCommand(Ac ac){
        this.ac=ac;
    }
    @Override
    public void execute() {
    ac.turnOff();
    }

    @Override
    public void undo() {
     ac.turnOn();
    }

    @Override
    public void redo() {

    }
}
