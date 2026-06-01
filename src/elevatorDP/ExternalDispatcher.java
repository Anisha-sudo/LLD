package elevatorDP;

import java.util.List;

public class ExternalDispatcher {
    //Create elevator objects and their controllers .
    // set this list of elevator controller in main method on onboarding.
    //set strategy on onboarding.
    static List<ElevatorController>elevatorControllerList;
    static ElevatorSelectionStrategy elevatorSelectionStrategy;
    private ExternalDispatcher(){
    }
    static ExternalDispatcher externalDispatcher=null;
    public static ExternalDispatcher getExternalDispatcher(){
        if(externalDispatcher!=null){
            return externalDispatcher;
        }
        return externalDispatcher= new ExternalDispatcher();

    }

    public void allocateElevator(int floor,Direction direction){
        ElevatorController elevatorController=elevatorSelectionStrategy.getElevatorController(floor,direction,elevatorControllerList);
        System.out.println("best Elevator Selected is "+elevatorController.elevator.ElevatorId);
        elevatorController.requestStop(floor);
    }
}
