package SingletonDP;

public class PrinterService {
     int val;
    private static volatile PrinterService  printerServiceObj;
    private PrinterService(){
        //create private constructor
    }

    public static PrinterService getInstance(){
        //create static method because it can be accessed directly without obj of class;
        if(printerServiceObj==null){
            return printerServiceObj=new PrinterService();
        }
        return printerServiceObj;
    }
}


