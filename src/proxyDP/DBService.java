package proxyDP;

public class DBService implements DBServiceInterface{
    @Override
    public void readData(String user) {
        System.out.println("reading data,user is "+user);
    }

    @Override
    public void writeData(String user) {
       System.out.println("Writing data ,user is "+user);
    }
}
