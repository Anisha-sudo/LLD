package elevatorDP;

import java.util.List;

public class LeastBusyElevator implements ElevatorSelectionStrategy{

    @Override
    public ElevatorController getElevatorController(int floor, Direction direction,List<ElevatorController>elevatorControllerList) {

        ElevatorController bestController= null;
        int size=Integer.MAX_VALUE;

        for(ElevatorController controller:elevatorControllerList){

             int controllerSize=controller.downMaxPQ.size()+controller.upMinPQ.size();
             if(size<=controllerSize){
                 bestController=controller;
                 size=controllerSize;
             }

        }
        return bestController;
    }
}
