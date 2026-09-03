package FacadeDesignPattern;

public class EmployeeDao {

    public void registerEmployee(){
     System.out.println("Employee registered");
    }
    public void getItems(){
        System.out.println("Items fetched");
    }
    public void updateItems(){
        System.out.println("Items updated");
    }
    public void deleteItems(){
        System.out.println("Items deleted");
    }
    public void login(){
        System.out.println("Login");
    }
    public void logout(){
        System.out.println("Logout");
    }
}
