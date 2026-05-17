package SingletonDP;

public class Main {
    public static void main(String[] args) {
        PrinterService obj= PrinterService.getInstance();
        System.out.println(obj.val);
        obj.val=8;
        PrinterService obj1= PrinterService.getInstance();
        System.out.println(obj1.val);

    }

}
