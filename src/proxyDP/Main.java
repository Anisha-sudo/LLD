package proxyDP;

public class Main {
    public static void main(String[] args) {
        DBServiceInterface dbServiceProxy=new DBServiceProxy();
        dbServiceProxy.readData("anisha");
        dbServiceProxy.writeData("anisha");
        dbServiceProxy.writeData("admin");

    }

}
