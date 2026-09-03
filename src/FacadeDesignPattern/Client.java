package FacadeDesignPattern;

public class Client {

    public static void main(String[] args) {
     EmployeeFacade employeeFacade=new EmployeeFacade();
     employeeFacade.registerEmployee();

     //facade a layer created for client to interact with the system, if any changes in the system, client code will not be affected
    }
}
