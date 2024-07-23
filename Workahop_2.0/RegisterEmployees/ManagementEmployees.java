import java.util.ArrayList;


public class ManagementEmployees{
    private final ArrayList<Employee> employees;    

    public ManagementEmployees(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public ArrayList<Employee> obtainEmployees(){
        return employees;
    }
}