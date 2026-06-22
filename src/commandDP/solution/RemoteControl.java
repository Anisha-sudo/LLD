package commandDP.solution;

import java.util.Stack;

public class RemoteControl {
    Stack<Command> commandHistory=new Stack<>();
    private Command command;

    public void setCommand(Command command){
        this.command=command;

    }
    public void pressButton(){
        command.execute();
        commandHistory.push(command);
    }
    public void undo(){
        if(commandHistory.isEmpty()){
            return;
        }
        commandHistory.pop().undo();
    }
}
