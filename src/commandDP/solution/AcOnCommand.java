package commandDP.solution;

public class AcOnCommand implements Command{
    Ac ac;
    public AcOnCommand(Ac ac){
        this.ac=ac;
    }
    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
    ac.turnOff();
    }

    @Override
    public void redo() {

    }
}
