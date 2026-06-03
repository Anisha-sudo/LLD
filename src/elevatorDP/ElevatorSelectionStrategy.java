package elevatorDP;

import java.util.List;

public interface ElevatorSelectionStrategy {
    ElevatorController  getElevatorController(int floor,Direction direction,List<ElevatorController> elevatorControllerList);

}
