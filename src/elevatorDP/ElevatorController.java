package elevatorDP;

import java.util.concurrent.PriorityBlockingQueue;

public class ElevatorController implements  Runnable {
    Elevator elevator;
    // private final Object monitor = new Object();
    PriorityBlockingQueue<Integer>upMinPQ;
    PriorityBlockingQueue<Integer>downMaxPQ;
    public ElevatorController(Elevator elevator)
    {
        this.elevator=elevator;
        this.upMinPQ=new PriorityBlockingQueue<>();
        this.downMaxPQ=new PriorityBlockingQueue<>(10,(a,b)->b-a);

    }
    void requestStop(int destinationfloor){
       if(destinationfloor==elevator.nextFloorStoppage)return;
       if(destinationfloor>elevator.nextFloorStoppage && !upMinPQ.contains(destinationfloor)){
           upMinPQ.add(destinationfloor);
       }else if (destinationfloor<elevator.nextFloorStoppage && !downMaxPQ.contains(destinationfloor)){
           downMaxPQ.add(destinationfloor);
       }
        synchronized (this) {
        this.notify();   // wake elevator thread
        }

    }

    public void run(){
        runElevator();
    }

    public void runElevator(){

        while(true){
            synchronized (this){
                while(upMinPQ.isEmpty() && downMaxPQ.isEmpty()) {
                    try {
                        System.out.println("This elevator has no request::"+elevator.ElevatorId);
                        elevator.direction = Direction.IDLE;
                        this.wait();//sleep this thread
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
            }

            while(!upMinPQ.isEmpty()){
             int floor=upMinPQ.poll();
             elevator.move(floor);
            }
            while (!downMaxPQ.isEmpty()){
                int floor=downMaxPQ.poll();
                elevator.move(floor);
            }
        }

    }

}
