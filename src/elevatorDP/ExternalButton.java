package elevatorDP;

public class ExternalButton {

    ExternalDispatcher externalDispatcher = null;

    public void press(int floor,Direction direction){
        if(externalDispatcher==null){
            externalDispatcher=ExternalDispatcher.getExternalDispatcher();
        }
        externalDispatcher.allocateElevator(floor,direction);

    }

}
