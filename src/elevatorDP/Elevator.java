package elevatorDP;

public class Elevator {
    int ElevatorId;
    Display display;
    int currFloor;
    int nextFloorStoppage;
    InternalButton internalButton;
    Direction direction;
    Elevator(int id,int currFloor){
        this.ElevatorId=id;
        this.currFloor=currFloor;
    }
    public void move(int floor){
       nextFloorStoppage=floor;
       if (currFloor>nextFloorStoppage){
           direction=Direction.DOWN;
           for(int i=currFloor-1;i>=nextFloorStoppage;i--){
               try {
                   System.out.println("Elevator::"+ElevatorId+" is in floor" + i);
                   Thread.sleep(50);
               }catch (InterruptedException e){
                   Thread.interrupted();
               }
           }
       }else if(currFloor<nextFloorStoppage){
           direction=Direction.UP;
           for(int i=currFloor+1;i<=nextFloorStoppage;i++){
               try {
                   System.out.println("Elevator::"+ElevatorId+" is in floor" + i);
                   Thread.sleep(50);
               }catch (InterruptedException e){
                   Thread.interrupted();
               }
           }
       }else direction=Direction.IDLE;


    }
}
