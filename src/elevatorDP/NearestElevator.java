package elevatorDP;

import java.util.List;

public class NearestElevator implements ElevatorSelectionStrategy{

    public ElevatorController getElevatorController(int requestedFloor,Direction direction,List<ElevatorController>elevatorControllerList) {
        int minDist=Integer.MAX_VALUE;
        ElevatorController bestController=null;
        for(ElevatorController controller:elevatorControllerList){
            boolean isSameDirection=
            controller.elevator.direction==direction && ((direction==Direction.UP && requestedFloor>=controller.elevator.nextFloorStoppage)||
                    (direction==Direction.DOWN && requestedFloor<=controller.elevator.nextFloorStoppage));

            int dist = Math.abs(controller.elevator.nextFloorStoppage - requestedFloor);

            if(isSameDirection && dist<=minDist){
                minDist=dist;
                bestController=controller;
            }
        }
        if(bestController==null){
            for(ElevatorController controller :elevatorControllerList){
                if(controller.elevator.direction==Direction.IDLE){
                    bestController=controller;
                    break;
                }

            }
        }
        if(bestController==null){
            bestController=elevatorControllerList.get(0);
        }


        return bestController;
    }
}
