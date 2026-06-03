package SingletonDP;

public class PrinterService {
     int val;
    private static volatile PrinterService  printerServiceObj;
    private PrinterService(){
        //create private constructor
    }

    public static PrinterService getInstance(){
     //added double lock and synchronized for multi threading.
        if(printerServiceObj==null){
            //create static method because it can be accessed directly without obj of class;
            synchronized(PrinterService.class) {
                if (printerServiceObj == null) {
                    return printerServiceObj = new PrinterService();
                }
            }
        }
        return printerServiceObj;
    }
}


