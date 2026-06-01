package elevatorDP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator(1,-1);
        Elevator elevator2 = new Elevator(2,-1);

        ElevatorController elevatorController1 = new ElevatorController(elevator1);
        ElevatorController elevatorController2 = new ElevatorController(elevator2);


        Thread t1 = new Thread(elevatorController1);
        Thread t2 = new Thread(elevatorController2);

        t1.start();
        t2.start();

        ExternalDispatcher.elevatorControllerList=new ArrayList<>(List.of(elevatorController1,elevatorController2));
        ExternalDispatcher.elevatorSelectionStrategy=new LeastBusyElevator();
        ExternalButton externalButton =new ExternalButton();
        externalButton.press(5,Direction.UP);
        externalButton.press(8,Direction.UP);
    }
}
