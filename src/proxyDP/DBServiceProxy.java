package proxyDP;

public class DBServiceProxy implements DBServiceInterface {
    DBService dbService;
    //can be used as restriction, cache,pre and post operation(validation or formatting etc)
    public DBServiceProxy(){
         dbService=new DBService();
    }

    @Override
    public void readData(String user) {
        //anyone can read;
        dbService.readData(user);
    }

    @Override
    public void writeData(String user) {
       if(user.equalsIgnoreCase("ADMIN")){
           dbService.writeData(user);
       }else{
           System.out.println("User is not admin, no write permission!!!");
       }
    }
}
