package FacadeDesignPattern;

public class EmployeeFacade {

    private EmployeeDao employeeDao;

    public EmployeeFacade() {
        this.employeeDao = new EmployeeDao();
    }
    public void registerEmployee(){
      employeeDao.registerEmployee();
    }
}
