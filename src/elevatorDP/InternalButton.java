package elevatorDP;

public class InternalButton {
    ElevatorController elevatorController;
    InternalButton (ElevatorController elevatorController){
        this.elevatorController=elevatorController;
    }
    public void press(int floor,Direction direction){
        elevatorController.requestStop(floor);
    }

}
